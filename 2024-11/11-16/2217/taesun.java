import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            s = br.readLine();
            arr[i] = Integer.parseInt(s);
        }
        Arrays.sort(arr);
        int max=0;
        for(int i=0;i<n;i++){
            int num = arr[i]*(n-i);
            max = Math.max(max,num);
        }
        bw.write(max+"");
        bw.flush();
    }
}