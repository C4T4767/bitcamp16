import java.io.*;
import java.util.*;


public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        int n = Integer.parseInt(s);
        int[] arr = new int[n];
        s = br.readLine();
        String[] st = s.split(" ");
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st[i]);
        }
        Arrays.sort(arr);
        s = br.readLine();
        int findNum = Integer.parseInt(s);
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==findNum){
                    count++;
                    break;
                }
                else if(arr[i]+arr[j]>findNum){
                    break;
                }
            }
        }
        bw.write(count+"");
        bw.flush();
    }
}