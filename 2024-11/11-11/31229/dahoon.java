import java.util.Scanner;

public class B_31229 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int start = 1;
        for (int i = 0; i < N; i++) {
            System.out.print(start + " ");
            start += 2;
        }
    }
}
