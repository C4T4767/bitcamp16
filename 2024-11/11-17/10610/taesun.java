import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int length = s.length();
        int[] count = new int[10];
        for(int i=0;i<length;i++){
            char c = s.charAt(i);
            count[c-'0']++;
        }
        int sum=0;
        for(int i=0;i<10;i++){
            sum+=count[i]*i;
        }
        if(count[0]==0||sum%3!=0){
            bw.write("-1");
        }
        else{
            for(int i=0;i<10;i++){
                while(count[9-i]>0){
                    bw.write(9-i+"");
                    count[9-i]--;
                }
            }
        }
        bw.flush();
    }
}
