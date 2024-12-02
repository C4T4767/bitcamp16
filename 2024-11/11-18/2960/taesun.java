import java.io.*;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        String[] st = s.split(" ");
        int n = Integer.parseInt(st[0]);
        int m = Integer.parseInt(st[1]);
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr, true);
        int count=0;
        int p = 2;
        out:
        while(true) {
            for (int i = 2; i <= n; i++) {
                if (arr[i] && i % p == 0) {
                    arr[i] = false;
                    count++;
                    if (count == m) {
                        bw.write(i + "");
                        break out;
                    }
                }
            }
            for (int j = p + 1; j <= n; j++) {
                if (arr[j]) {
                    p = j;
                    break;
                }
            }
        }
        bw.flush();
    }
}
