import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static Deque<Integer> dq = new ArrayDeque<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken(" ");

            int n = 0;
            if (st.hasMoreTokens()) {
                n = Integer.parseInt(st.nextToken());
            }

            switch (order) {
                case "push_front":
                    dq.push(n);
                    break;
                case "push_back":
                    dq.add(n);
                    break;
                case "pop_front":
                    if (!printIfEmpty()) {
                        System.out.println(dq.pollFirst());
                    }
                    break;
                case "pop_back":
                    if (!printIfEmpty()) {
                        System.out.println(dq.pollLast());
                    }
                    break;
                case "size":
                    System.out.println(dq.size());
                    break;
                case "empty":
                    if (dq.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "front":
                    if (!printIfEmpty()) {
                        System.out.println(dq.getFirst());
                    }
                    break;
                case "back":
                    if (!printIfEmpty()) {
                        System.out.println(dq.getLast());
                    }
                    break;
            }
        }
    }

    private static boolean printIfEmpty() {
        if (dq.isEmpty()) {
            System.out.println(-1);
            return true;
        }
        return false;
    }
}
