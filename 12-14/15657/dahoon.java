import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedWriter bw;
    static int N, M;
    static int[] arr, result;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        result = new int[M];
        dfs(0, 0);

        bw.flush();
        bw.close();
        br.close();
    }

    private static void dfs(int preIdx, int depth) throws Exception {
        if (M == depth) {
            for (int num : result) {
                bw.write(num + " ");
            }
            bw.write("\n");
            return;
        }

        for (int i = preIdx; i < N; i++) {
            result[depth] = arr[i];
            dfs(i, depth + 1);
        }
    }
}
