import java.io.*;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        int n = Integer.parseInt(s);
        int[] arr = new int[n+1];
        int[][] dp = new int[n+1][2];

        for (int i = 0; i < n; i++) {
            s = br.readLine();
            arr[i+1] = Integer.parseInt(s);
        }

        dp[0][0] = 0;
        dp[1][0] = arr[1];
        dp[1][1] = arr[1];

        for (int i = 2; i <= n; i++) {
            dp[i][1] = dp[i - 1][0] + arr[i];

            dp[i][0] = Math.max(dp[i - 2][0], dp[i - 2][1]) + arr[i];

        }

        bw.write(Math.max(dp[n][0], dp[n][1]) + "");
        bw.flush();
    }
}
