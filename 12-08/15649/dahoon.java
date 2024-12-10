import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int N, M;
    static boolean[] visited;
    static List<Integer> list;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        visited = new boolean[N + 1];
        list = new ArrayList<>();
        DFS();
    }

    private static void DFS() {
        if (list.size() == M) {
            for(Integer i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                list.add(i);
                DFS();
                list.remove(Integer.valueOf(i));
                visited[i] = false;
            }
        }
    }
}
