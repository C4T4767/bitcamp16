package coding_test.dec_1st;

import java.io.*;
import java.math.BigInteger;

public class Dohyun10826 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        BigInteger[] arr = new BigInteger[2];
        arr[0] = BigInteger.ZERO;
        arr[1] = BigInteger.ONE;
        BigInteger temp;
        if(1<n) {
            for(int i=2; i<=n; i++){
                temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp.add(arr[1]);
            }
            bw.write(arr[1].toString());
        }else if(n == 0){
            bw.write('0');
        }else if(n == 1){
            bw.write('1');
        }
        bw.flush();
    }
}
