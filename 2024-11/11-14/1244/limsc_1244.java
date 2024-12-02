import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] switchNum = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            switchNum[i] = sc.nextInt();
        }

        int studentNum = sc.nextInt();
        for (int i = 0; i < studentNum; i++) {
            int sex = sc.nextInt();
            int num = sc.nextInt();
            if (sex == 1) {
                for (int j = num; j <= n; j += num) {
                    switchNum[j] = 1 - switchNum[j];
                }
            } else {
                switchNum[num] = 1 - switchNum[num];
                int j = 1;
                while (num - j > 0 && num + j < switchNum.length) {
                    if (switchNum[num - j] == switchNum[num + j]) {
                        switchNum[num + j] = 1 - switchNum[num + j];
                        switchNum[num - j] = 1 - switchNum[num - j];
                    } else {
                        break;
                    }
                    j++;
                }
            }
        }
        for (int i = 1; i < switchNum.length; i++) {
            System.out.print(switchNum[i] + " ");
            if (i % 20 == 0) System.out.println();
        }
    }
}