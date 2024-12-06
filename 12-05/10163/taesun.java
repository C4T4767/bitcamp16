import java.io.*;
import java.util.Arrays;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        int n = Integer.parseInt(s);
        int[][] arr = new int[1002][1002];
        for(int i=0;i<n;i++){
            s = br.readLine();
            String[] st = s.split(" ");
            int x1 = Integer.parseInt(st[0]);
            int y1 = Integer.parseInt(st[1]);
            int x2 = Integer.parseInt(st[2]);
            int y2 = Integer.parseInt(st[3]);
            for(int j=x1;j<x1+x2;j++){
                for(int k=y1;k<y1+y2;k++){
                    arr[j][k]=i+1;
                }
            }
        }
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<1002;j++){
                for(int k=0;k<1002;k++){
                    if(arr[j][k]==i+1){
                        count++;
                    }
                }
            }
            bw.write(count+"");
            if(i!=n-1){
                bw.write("\n");
            }
        }
        bw.flush();
    }
}