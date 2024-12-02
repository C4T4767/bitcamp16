import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[8];
        int[] arr2 = new int[8];
        int sum=0;
        for(int i=0;i<8;i++){
            arr[i] = Integer.parseInt(br.readLine());
            arr2[i] = arr[i];
        }
        Arrays.sort(arr);
        for(int i=7;i>2;i--){
            sum+=arr[i];
        }
        bw.write(Integer.toString(sum)+"\n");
        for(int i=0;i<8;i++){
            for(int j=7;j>2;j--){
                if(arr2[i]==arr[j]){
                    bw.write((i+1)+" ");
                }
            }
        }
        bw.flush();
    }
}
