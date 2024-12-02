import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String[][] bingo = new String[5][5];
        for (int i = 0; i < 5; i++) {
            bingo[i] = br.readLine().split(" ");
        }
        int Complete = 0, reNum = 0;
        do {
            String[] input = br.readLine().split(" ");
            loop:
            for (int i = 0; i < 5; i++) {
                String bingoN = input[i];
                reNum++; // 시행횟수증가
                for (int x = 0; x < 5; x++) { //x좌표
                    for (int y = 0; y < 5; y++) { //y좌표
                        if (bingoN.equals(bingo[x][y])) { //입력 값이 배열에 있다면
                            bingo[x][y] = null; //배열에서 값 삭제
                            boolean checkNull;
                            if (x == y) { // 우하향 대각
                                checkNull = true;
                                for (int bc = 0; bc < 5; bc++) { //bingoCheck
                                    if (bingo[bc][bc] != null) {
                                        checkNull = false;
                                    }
                                }
                                if (checkNull) {
                                    Complete++;
                                }
                            }
                            if (x + y == 4) { // 우상향 대각
                                checkNull = true;
                                int checkY = 4;
                                for (int bc = 0; bc < 5; bc++) { //bingoCheck
                                    if (bingo[bc][checkY] != null) {
                                        checkNull = false;
                                    }
                                    checkY--;
                                }
                                if (checkNull) {
                                    Complete++;
                                }
                            }
                            checkNull = true;
                            for (int bc = 0; bc < 5; bc++) { //bingoCheck
                                if (bingo[bc][y] != null) {
                                    checkNull = false;
                                }
                            }
                            if (checkNull) {
                                Complete++;
                            }
                            checkNull = true;
                            for (int bc = 0; bc < 5; bc++) { //bingoCheck
                                if (bingo[x][bc] != null) {
                                    checkNull = false;
                                }
                            }
                            if (checkNull) {
                                Complete++;
                            }
                            if (Complete >= 3)
                                break loop;
                        }
                    }
                }
            }
        } while (Complete < 3);
        System.out.println(reNum);
    }
}