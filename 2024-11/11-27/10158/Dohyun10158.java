package coding_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dohyun10158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int x = Integer.parseInt(in[0]);
        int y = Integer.parseInt(in[1]);
        in = br.readLine().split(" ");
        int currentX = Integer.parseInt(in[0]);
        int currentY = Integer.parseInt(in[1]);
        int t = Integer.parseInt(br.readLine());

        int restX = t%(2*x);
        boolean direc = true;
        for(int i=restX; i>0; i--){
            if(currentX == x || currentX == 0)
                direc = !direc;
            if(direc)
                currentX++;
            else
                currentX--;
        }

        int restY = t%(2*y);
        direc = true;
        for(int i=restY; i>0; i--){
            if(currentY == y || currentY == 0)
                direc = !direc;
            if(direc)
                currentY++;
            else
                currentY--;
        }
        System.out.println(currentX+" "+currentY);
    }
}