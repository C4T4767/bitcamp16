package coding_test.dec_2nd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dohyun15650 {
    static StringBuilder sb = new StringBuilder();
    static boolean[] visited;
    static byte[] output;
    static byte n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        n = Byte.parseByte(in[0]);
        m = Byte.parseByte(in[1]);
        visited = new boolean[n+1];
        output = new byte[m+1];
        sequence((byte) 0);
        System.out.println(sb);
    }

    static void sequence(byte dep) {
        if (m == dep) {
            for (byte i = 1; i <= m; i++) {
                sb.append(output[i]).append(" ");
            }
            sb.append("\n");
        } else {
            for (byte i = 1; i <= n; i++) {
                if(output[dep] <= i) {
                    if (!visited[i]) {
                        visited[i] = true;
                        output[dep+1] = i;
                        sequence((byte) (dep + 1));
                        visited[i] = false;
                    }
                }
            }
        }
    }
}
