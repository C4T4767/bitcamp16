import java.util.Scanner;

public class 성철_20241108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] place = new int[100][100];
        int x1=0,y1=0,x2=0,y2=0;
        int totalSum=0;

        for (int i = 0; i < 4; i++) {
            x1=sc.nextInt();
            y1=sc.nextInt();
            x2=sc.nextInt();
            y2=sc.nextInt();
            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    place[j][k]=1;
                }
            }
        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                totalSum+=place[i][j];
            }
        }
        System.out.println(totalSum);
    }
}