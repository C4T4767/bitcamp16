import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        // B를 내림차순으로 값을 조회하며 정렬한 A와 곱해 합산
        int sum = 0;
        int max = Integer.MAX_VALUE;
        Set<Integer> idxSet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            // 현재 루프에서의 최대값 계산
            int idx = -1;
            int curMax = Integer.MIN_VALUE;
            for (int j = 0; j < N; j++) {
                if (!idxSet.contains(j) && curMax < B[j] && B[j] <= max) {
                    curMax = B[j];
                    idx = j;
                }
            }
            sum += curMax * A[i];
            max = curMax;  // 다음 루프에서의 기준값 갱신
            idxSet.add(idx);  // 이미 조회한 최대값의 인덱스 저장
        }
        System.out.println(sum);
    }
}
