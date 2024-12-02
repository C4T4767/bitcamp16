import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Integer> vList = new ArrayList<>();  // 가로
        List<Integer> hList = new ArrayList<>();  // 세로
        int cut = Integer.parseInt(br.readLine());
        for (int i = 0; i < cut; i++) {
            st = new StringTokenizer(br.readLine());
            int way = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            if (way == 0) {
                vList.add(n);
            } else {
                hList.add(n);
            }
        }
        vList.add(0);
        vList.add(M);
        hList.add(0);
        hList.add(N);

        Collections.sort(vList);
        Collections.sort(hList);

        int maxHeight = Integer.MIN_VALUE;
        int maxWidth = Integer.MIN_VALUE;
        for (int i = 0; i < vList.size() - 1; i++) {
            maxHeight = Math.max(maxHeight, vList.get(i + 1) - vList.get(i));
        }
        for (int i = 0; i < hList.size() - 1; i++) {
            maxWidth = Math.max(maxWidth, hList.get(i + 1) - hList.get(i));
        }

        System.out.println(maxHeight * maxWidth);
    }
}
