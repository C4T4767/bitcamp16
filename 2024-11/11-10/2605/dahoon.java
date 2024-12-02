package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2605 {
    static int[] arr;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = i;
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            int c = Integer.parseInt(st.nextToken());
            if (c != 0) {
                int target = i - c;
                shift(i, target);
            }
        }

        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void shift(int cur, int target) {
        int num = arr[cur];
        while (cur > target) {
            arr[cur] = arr[cur - 1];
            cur--;
        }
        arr[target] = num;
    }
}
