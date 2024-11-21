package coding_test;

import java.io.*;

public class Dohyun2564 {
    static int x;
    static int y;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        x = Integer.parseInt(in[0]);
        y = Integer.parseInt(in[1]);
        int n = Integer.parseInt(br.readLine());
        int[][] coordinates= new int[n+1][2];
        for (int i = 0; i <= n; i++) {
            in = br.readLine().split(" ");
            coordinates[i][0] = Integer.parseInt(in[0]);
            coordinates[i][1] = Integer.parseInt(in[1]);
        }

        int sum = 0;
        for(int i=0; i<n; i++) {
            int distance = distance(coordinates[n],coordinates[i]);
            sum += Math.min(distance, (2*x)+(2*y)-distance);
        }
        System.out.println(sum);
    }

    static int distance(int[] donggeun, int[] dst){
        int[] coordinate = findCoordinate(donggeun);
        int currentX = coordinate[0];
        int currentY = coordinate[1];
        coordinate = findCoordinate(dst);
        int destX = coordinate[0];
        int destY =coordinate[1];

        int direction = 0;
        switch (donggeun[0]) {
            case 1:
                direction = 3;
                break;
            case 2:
                direction = 1;
                break;
            case 3:
                direction = 4;
                break;
            case 4:
                direction = 2;
                break;
        }

        int distance = 0;
        while (currentX != destX || currentY != destY) {
            switch (direction){
                case 1:
                    if(currentX == x){
                        direction = direction(direction);
                        continue;
                    }else{
                        currentX++;
                    }
                    break;
                case 2:
                    if(currentY == 0){
                        direction = direction(direction);
                        continue;
                    }else{
                        currentY--;
                    }
                    break;
                case 3:
                    if(currentX == 0){
                        direction = direction(direction);
                        continue;
                    }else{
                        currentX--;
                    }
                    break;
                case 4:
                    if(currentY == y){
                        direction = direction(direction);
                        continue;
                    }else{
                        currentY++;
                    }
                    break;
            }
            distance++;
        }
        return distance;
    }

    static int direction(int direction) {
        if (direction < 4)
            direction++;
        else {
            direction = 1;
        }
        return direction;
    }

    static int[] findCoordinate(int[] dst){
        int[] coor = new int[2];
        switch (dst[0]){
            case 1:
                coor[0] = dst[1];
                break;
            case 2:
                coor[0] = dst[1];
                coor[1] = y;
                break;
            case 3:
                coor[1] = dst[1];
                break;
            case 4:
                coor[0] = x;
                coor[1] = dst[1];
                break;
        }
        return coor;
    }
}