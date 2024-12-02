import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] paper = new int[101][101];
        int n = sc.nextInt();
        int x,y;
        int sum=0;

        for (int i = 0; i < n; i++) {
            x=sc.nextInt();
            y=sc.nextInt();
            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y+10; k++) {
                    paper[j][k]=1;
                }
            }
        }
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                sum+=paper[i][j];
            }
        }
        System.out.println(sum);
    }
}