import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        int M = Integer.parseInt(br.readLine());

        boolean[] list = new boolean[21];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            int num = -1;
            if (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }

            switch(order) {
                case "check":
                    if (list[num]) {
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    break;
                case "add":
                    list[num] = true;
                    break;
                case "remove":
                    list[num] = false;
                    break;
                case "toggle":
                    list[num] = !list[num];
                    break;
                case "all":
                    Arrays.fill(list, true);
                    break;
                case "empty":
                    Arrays.fill(list, false);
                    break;
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
