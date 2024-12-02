import java.io.*;
import java.util.Scanner;

public class Main {

    static int[][] bingo;
    static int count;

    public static void rowCheck() {
        for(int i  = 0; i < 5; i++) {
            int zerocount = 0;
            for(int j = 0; j < 5; j++) {
                if(bingo[i][j] == 0) {
                    zerocount++;
                }
            }
            if(zerocount == 5) {
                count++;
            }
        }
    }

    public static void columnCheck() {
        for(int i  = 0; i < 5; i++) {
            int zerocount = 0;
            for(int j = 0; j < 5; j++) {
                if(bingo[j][i] == 0) {
                    zerocount++;
                }
            }
            if(zerocount == 5) {
                count++;
            }        }
    }

    //왼쪽에서 오른쪽으로 가는 대각선
    public static void lrCheck() {
        int zerocount = 0;
        for(int i  = 0; i < 5; i++) {
            if(bingo[i][i] == 0) {
                zerocount++;
            }

        }
        if(zerocount == 5) {
            count++;
        }
    }

    public static void rlCheck() {
        int zerocount = 0;
        for(int i  = 0; i < 5; i++) {
            if(bingo[i][4-i] == 0) {
                zerocount++;
            }
        }
        if(zerocount == 5) {
            count++;
        }
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        bingo = new int[5][5];
        count = 0;

        // 빙고판 입력
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                bingo[i][j] = sc.nextInt();
            }
        }

        for(int k = 1; k <= 25; k++) {
            int num = sc.nextInt();

            for(int i = 0; i < 5; i++) {
                for(int j = 0; j < 5; j++) {
                    if(bingo[i][j] == num) // 사회자가 부른 숫자와 같다면 0으로 바꾸기
                        bingo[i][j] = 0;
                }
            }

            rowCheck();
            columnCheck();
            lrCheck();
            rlCheck();

            if(count >= 3) { // 3줄 이상 빙고이면 몇 번째 숫자인지 출력하고 종료
                System.out.println(k);
                break;
            }
            count = 0;
        }
    }
}