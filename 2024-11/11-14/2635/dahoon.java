import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= N; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(N);
            list.add(i);

            int cnt = 2;
            int idx = 2;
            while(true) {
                int next = list.get(idx - 2) - list.get(idx - 1);
                if (next < 0) {
                    break;
                }
                list.add(next);
                cnt++;
                idx++;
            }

            if (max <= cnt) {
                max = cnt;
                result = list;
            }
        }

        System.out.println(max);
        for (int r : result) {
            System.out.print(r  + " ");
        }
    }
}
