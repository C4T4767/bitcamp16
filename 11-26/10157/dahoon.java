import java.util.Scanner;

public class Main {
    static int R, C;
    static int[][] seat;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        C = sc.nextInt();
        R = sc.nextInt();
        int K = sc.nextInt();

        if (C * R < K) {
            System.out.println(0);
            return;
        }

        seat = new int[R][C];
        int i = 0;
        int j = 0;
        int n = 1;
        while (n <= K) {
            if (n == K) {
                printAns(j , i);
                return;
            }
            while (i + 1 < R && seat[i + 1][j] == 0) {
                if (n == K) {
                    printAns(j, i);
                    return;
                }
                seat[i][j] = n;
                System.out.println(n);
                n++;
                i++;
            }
            while (j + 1 < C && seat[i][j + 1] == 0) {
                if (n == K) {
                    printAns(j, i);
                    return;
                }
                System.out.println(n);
                seat[i][j] = n;
                n++;
                j++;
            }
            while (i - 1 >= 0 && seat[i - 1][j] == 0) {
                if (n == K) {
                    printAns(j, i);
                    return;
                }
                System.out.println(n);
                seat[i][j] = n;
                n++;
                i--;
            }
            while (j - 1 >= 0 && seat[i][j - 1] == 0) {
                if (n == K) {
                    printAns(j, i);
                    return;
                }
                System.out.println(n);
                seat[i][j] = n;
                n++;
                j--;
            }
        }
    }

    private static void printAns(int i, int j) {
        System.out.println((i + 1) + " " + (j + 1));
    }
}
