package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_2669 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        int[][] arr = new int[100][100];
        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int height = y2 - y1;
            int width = x2 - x1;

            for (int j = height; j > 0; j--) {
                for (int k = 0; k < width; k++) {
                    arr[arr.length - y1 - j][x1 + k] = 1;
                }
            }
        }

        long count = Arrays.stream(arr)
                .flatMapToInt(Arrays::stream)
                .filter(num -> num == 1)
                .count();

        System.out.println(count);
    }
}
