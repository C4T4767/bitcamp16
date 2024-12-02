import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st= new StringTokenizer(br.readLine());

        int width = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());
        int store = Integer.parseInt(br.readLine());

        boolean[][] map = new boolean[height + 1][width + 1];
        for (int i = 0; i < store; i++) {
            st = new StringTokenizer(br.readLine());
            int way = Integer.parseInt(st.nextToken());
            int distance = Integer.parseInt(st.nextToken());

            if (way == 1) {
                map[height][distance] = true;
            } else if (way == 2) {
                map[0][distance] = true;
            } else if (way == 3) {
                map[height - distance][0] = true;
            } else {
                map[height - distance][width] = true;
            }
        }

        st = new StringTokenizer(br.readLine());
        int way = Integer.parseInt(st.nextToken());
        int distance = Integer.parseInt(st.nextToken());

        // 시작위치
        int x;
        int y;
        if (way == 1) {
            x = height;
            y = distance;
        } else if (way == 2) {
            x = 0;
            y = distance;
        } else if (way == 3) {
            x = height - distance;
            y = 0;
        } else {
            x = height - distance;
            y = width;
        }

        int total = (width + height) * 2;
        int sum = 0;
        int cnt = 0;
        int checkedStore = 0;
        while (checkedStore < store) {
            if (map[x][y]) {
                // 상점을 만난 경우 최소거리 합산
                sum += Math.min(cnt, total - cnt);
                checkedStore++;
            }

            // 좌표 이동
            if (x == 0) {
                if (y == width) {
                    x++;
                } else {
                    y++;
                }
            } else if (y == width) {
                if (x == height) {
                    y--;
                } else {
                    x++;
                }
            } else if (x == height) {
                if (y == 0) {
                    x--;
                } else {
                    y--;
                }
            } else {
                x--;
            }
            cnt++;
        }

        bw.write(sum +"\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
