import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int N = Integer.parseInt(br.readLine());

        final int arrLength = 6;  // 배열의 길이

        int width = Integer.MIN_VALUE;
        int height = Integer.MIN_VALUE;
        int[][] arr = new int[arrLength][2];
        for (int i = 0; i < arrLength; i++) {
            st = new StringTokenizer(br.readLine());
            int way = Integer.parseInt(st.nextToken());  // 방향
            int length = Integer.parseInt(st.nextToken());  // 길이
            arr[i][0] = way;
            arr[i][1] = length;

            // 전체 사각형의 크기를 구하기 위한 가로, 세로 길이 구하기
            if (way == 1 || way == 2) {
                width = Math.max(width, length);
            }
            if (way == 3 || way == 4) {
                height = Math.max(height, length);
            }
        }

        System.out.println(Arrays.deepToString(arr));

        int diff = -1;
        for (int i = 0; i < arrLength; i++) {
            int next1 = i + 1;
            int next2 = i + 2;
            int next3 = i + 3;
            if (next1 >= arrLength) {
                next1 -= arrLength;
            }
            if (next2 >= arrLength) {
                next2 -= arrLength;
            }
            if (next3 >= arrLength) {
                next3 -= arrLength;
            }

            // 배열을 전체 순환하면서 배열의 4칸중 2칸 간격으로 같은 방향이 나올경우
            // 그 중 2, 3번째 요소의 길이를 곱하면 비어있는 사각형의 크기
            if (arr[i][0] == arr[next2][0] && arr[next1][0] == arr[next3][0]) {
                diff = arr[next2][1] * arr[next1][1];
                break;
            }
        }

        System.out.println((width * height - diff) * N);
    }
}
