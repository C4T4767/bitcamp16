import java.io.*;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int n, m;
    static int[] sequence;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        String[] st = br.readLine().split(" ");
        n = Integer.parseInt(st[0]);
        m = Integer.parseInt(st[1]);

        sequence = new int[m];
        visited = new boolean[n + 1];

        bt(0);

        bw.flush();
    }

    public static void bt(int depth) throws IOException {
        if (depth == m) {
            for( int i=1;i<m;i++){
                if(sequence[i] < sequence[i-1]){
                    return;
                }
            }
            for (int i = 0; i < m; i++) {
                bw.write(sequence[i] + " ");
            }
            bw.write("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                sequence[depth] = i;
                bt(depth + 1);
                visited[i] = false;
            }
        }
    }
}