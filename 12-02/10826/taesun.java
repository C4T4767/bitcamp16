import java.io.*;
import java.math.BigInteger;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        int n = Integer.parseInt(s);
        BigInteger[] arr = new BigInteger[3];
        arr[0]=BigInteger.ZERO;
        arr[1]=BigInteger.ONE;
        for(int i=2;i<=n;i++) {
            arr[2]=arr[0].add(arr[1]);
            arr[0]=arr[1];
            arr[1]=arr[2];
        }
        if(n>=2) {
            bw.write(arr[2] + "");
        }
        else{
            bw.write(arr[n] + "");
        }
        bw.flush();
    }
}
