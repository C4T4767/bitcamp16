import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        int[] A = new int[n];
        int[] B = new int[101];
        s = br.readLine();
        String[] st = s.split(" ");
        for(int i=0;i<n;i++){
            A[i] = Integer.parseInt(st[i]);
        }
        s = br.readLine();
        st = s.split(" ");
        for(int i=0;i<n;i++){
            int num = Integer.parseInt(st[i]);
            B[num]++;
        }
        int count=0;
        int sum=0;
        Arrays.sort(A);
        for(int i=0;i<=100;i++){
            while(B[i]>0){
                sum+=A[n-count-1]*i;
                count++;
                B[i]--;
            }
        }
        System.out.println(sum);
    }
}
