import java.util.Scanner;

public class Main {
    static int mod = 15746;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long[] dp = new long[1000001];
        dp[1] = 1;  // 1
        dp[2] = 2;  // 00, 11
        for (int i = 3; i <= 1000000; i++) {
            dp[i] = (dp[i - 2] + dp[i - 1]) % mod;
        }

        System.out.println(dp[N]);
    }
}
