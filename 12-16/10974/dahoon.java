import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    static int N;
    static int[] arr;
    static boolean[] visited;

    static BufferedWriter bw;
    public static void main(String[] args) throws Exception {
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        arr = new int[N + 1];
        visited = new boolean[N + 1];
        dfs(0, 0);

        bw.flush();
        bw.close();
    }

    private static void dfs(int node, int depth) throws Exception {
        if (depth == N) {
            for (int i = 1;i <= N; i++) {
                bw.write(arr[i] + " ");
            }
            bw.write("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i] && node != i) {
                visited[i] = true;
                arr[depth + 1] = i;
                dfs(i, depth + 1);
                visited[i] = false;
            }
        }
    }
}
