import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[8];
        int mini, minX = 0, sum = 0;
        String str = "";

        for (int i = 0; i < 8; i++) {
            score[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            mini = 999;
            for (int j = 0; j < 8; j++) {
                if (mini > score[j]) {
                    mini = score[j];
                    minX = j;
                }
            }
            score[minX]=999;
        }
        for (int i = 0; i < 8; i++) {
            if (score[i] != 999) {
                sum += score[i];
                str += (i+1) + " ";
            }
        }
        System.out.println(sum+"\n"+str);
    }
}
