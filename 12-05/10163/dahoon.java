import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        int[] cnt = new int[101];
        int[][] arr = new int[1001][1001];
        for (int k = 1; k <= N; k++) {
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int width = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());

            for (int i = x; i < x + height; i++) {
                for (int j = y; j < y + width; j++) {
                    if (arr[i][j] > 0) {
                        cnt[arr[i][j]]--;
                    }
                    arr[i][j] = k;
                    cnt[k]++;
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            System.out.println(cnt[i]);
        }
    }
}
