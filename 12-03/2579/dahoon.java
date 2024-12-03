import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[301];

        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] dp = new int[301];
        dp[1] = arr[1];
        dp[2] = Math.max(arr[1], dp[0]) + arr[2];
        for (int i = 3; i <= 300; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + arr[i - 1]) + arr[i];
        }

        System.out.println(dp[N]);
    }
}
