package coding_test;

import java.io.*;
import java.util.Arrays;

public class Dohyun1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int k = Integer.parseInt(in[1]);
        int po = 0;
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr, true);

        int[] result = new int[n];
        for(int i=1; i<=n; i++){
            for(int j=k; j>0;){
                if(arr[pointPlus(po, n)]){
                    j--;
                }
                po = pointPlus(po, n);
            }
            result[i-1] = po;
            arr[po] = false;
        }
        bw.write("<"+result[0]);
        for(int i=1; i<n; i++){
            bw.write(", "+result[i]);
        }
        bw.write(">");
        bw.flush();
    }

    static int pointPlus(int po, int n){
        if(po<n){
            po++;
        }else{
            po=1;
        }
        return po;
    }
}
