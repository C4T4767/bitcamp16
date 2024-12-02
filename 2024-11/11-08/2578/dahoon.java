import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2578 {
    static final int N = 5;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] myBingo, answers;
    static boolean[][] correct;
    static int bingo;
    public static void main(String[] args) throws Exception {
        myBingo = composeArray();
        answers = composeArray();

        int cnt = 0;
        correct = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                cnt++;
                if (correctBingo(answers[i][j])) {
                    checkBingo();
                    if (bingo >= 3) {
                        System.out.println(cnt);
                        return;
                    }
                }
            }
        }
    }

    // 배열구성
    private static int[][] composeArray() throws Exception {
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        return arr;
    }

    // 빙고개수체크
    private static void checkBingo() {
        bingo = 0;
        checkWidth();
        checkHeight();
        checkLeftDiagonal();
        checkRightDiagonal();
    }

    // 가로 빙고 개수 체크
    private static void checkWidth() {
        for (int i = 0; i < N; i++) {
            boolean flag = true;
            for (int j = 0; j < N; j++) {
                if (!correct[i][j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                bingo++;
            }
        }
    }

    // 세로 빙고 개수 체크
    private static void checkHeight() {
        for (int i = 0; i < N; i++) {
            boolean flag = true;
            for (int j = 0; j < N; j++) {
                if (!correct[j][i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                bingo++;
            }
        }
    }

    // 대각선 빙고 개수 체크(왼쪽위 -> 오른쪽 아래)
    private static void checkLeftDiagonal() {
        boolean flag = true;
        for (int i = 0; i < N; i++) {
            if (!correct[i][i]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            bingo++;
        }
    }

    // 대각선 빙고 개수 체크(오른쪽위 -> 왼쪽 아래)
    private static void checkRightDiagonal() {
        boolean flag = true;
        for (int i = 0; i < N; i++) {
            int j = N - i - 1;
            if (!correct[i][j]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            bingo++;
        }
    }

    // 정답체크
    private static boolean correctBingo(int cur) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (myBingo[i][j] == cur) {
                    correct[i][j] = true;
                    return true;
                }
            }
        }
        return false;
    }
}
