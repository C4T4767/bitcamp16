import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] size = new int[6][2];
        int max, min;
        int sum12 = 0, sum34 = 0;
        int sizeResult, orientalMelon;
        int x=0;

        for (int i = 0; i < 6; i++) {
            size[i][0] = sc.nextInt();
            size[i][1] = sc.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            if (size[i][0] == 1 || size[i][0] == 2) {
                sum12 += size[i][1];
            } else {
                sum34 += size[i][1];
            }
        }
        for (int i = 2; i < 6; i++) {
            if(size[i][0]==size[i-2][0]){
                x=i;
                if(size[1][0]==size[5][0]) x--;
                break;
            }
        }

        max = (sum12 / 2) * (sum34 / 2);
        if (x==0) min = size[0][1] * size[5][1];
        else min = size[x-1][1] * size[x][1];

        sizeResult = max - min;
        orientalMelon = sizeResult * n;
        System.out.println(orientalMelon);
    }
}