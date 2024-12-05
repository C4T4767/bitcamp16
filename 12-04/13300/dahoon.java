import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());  // 인원 수
        int K = Integer.parseInt(st.nextToken());  // 한 방에 배정할 수 있는 인원 수

        int[][] arr = new int[6][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken());
            arr[grade - 1][s]++;
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (arr[i][j] > 0) {
                    if (arr[i][j] % 2 == 0) {
                        cnt += arr[i][j] / K;
                    } else {
                        cnt += (arr[i][j] / K + 1);
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
