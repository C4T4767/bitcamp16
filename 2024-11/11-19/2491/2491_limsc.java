import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int max = 1, downCount = 1, upCount = 1;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < n; i++) {
            if (arr[i-1] <= arr[i]) {
                upCount++;
            } else upCount = 1;

            if (arr[i-1] >= arr[i]) {
                downCount++;
            } else downCount = 1;

            max = Math.max(max, Math.max(downCount, upCount));
        }
        System.out.println(max);
    }
}