import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] switches;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        switches = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            switches[i] = n;
        }

        int P = Integer.parseInt(br.readLine());
        for (int i = 0; i < P; i++) {
            st = new StringTokenizer(br.readLine());
            int person = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            if (person == 1) {
                male(num);
            } else {
                female(num - 1);
            }
        }

        print();
    }

    private static void swap(int idx) {
        if (switches[idx] == 1) {
            switches[idx] = 0;
        } else {
            switches[idx] = 1;
        }
    }

    private static void print() {
        for (int i = 0; i < switches.length; i++) {
            System.out.print(switches[i] + " ");
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
    }

    private static void male(int num) {
        for (int j = num - 1; j < switches.length; j+=num) {
            swap(j);
        }
    }

    private static void female(int num) {
        swap(num);  // 처음 주어진 스위치 변경

        // 주어진 스위치의 좌우로 대칭인경우 변경
        int idx = 1;
        while (true) {
            int left = num - idx;
            int right = num + idx;
            if (left >= 0 && right < switches.length && switches[left] == switches[right]) {
                swap(left);
                swap(right);
                idx++;
            } else {
                break;
            }
        }
    }
}
