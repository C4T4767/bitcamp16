package coding_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dohyun10157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int x = Integer.parseInt(in[0]);
        int y = Integer.parseInt(in[1]);
        int k = Integer.parseInt(br.readLine());

        int currentX = 1;
        int currentY = 0;
        int dr = 1;
        if(k<=x*y) {
            loop:
            while (true) {
                switch (dr) {
                    case 1:
                        for (int j = y; j > 0; j--) {
                            currentY++;
                            k--;
                            if (k == 0)
                                break loop;
                        }
                        x--;
                        break;
                    case 2:
                        for (int j = x; j > 0; j--) {
                            currentX++;
                            k--;
                            if (k == 0)
                                break loop;
                        }
                        y--;
                        break;
                    case 3:
                        for (int j = y; j > 0; j--) {
                            currentY--;
                            k--;
                            if (k == 0)
                                break loop;
                        }
                        x--;
                        break;
                    case 4:
                        for (int j = x; j > 0; j--) {
                            currentX--;
                            k--;
                            if (k == 0)
                                break loop;
                        }
                        y--;
                        break;
                }
                dr = direction(dr);
            }
            System.out.println(currentX + " " + currentY);
        }else{
            System.out.println(0);
        }
    }

    static int direction(int dr){
        if(dr == 4){
            return 1;
        }
        return ++dr;
    }
}
