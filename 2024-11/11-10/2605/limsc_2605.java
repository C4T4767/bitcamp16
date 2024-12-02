import java.util.ArrayList;
import java.util.Scanner;

public class 성철_20241108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            list.add(i - x, i + 1);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}