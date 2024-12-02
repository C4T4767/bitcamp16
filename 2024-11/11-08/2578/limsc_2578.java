import java.util.Scanner;

public class 성철_20241108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] cBingo = new int[5][5];
        int[][] oBingo = new int[5][5];
        int[] bingo = new int[25];
        int[] c1Bingo = new int[25];
        int n=0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                cBingo[i][j]= sc.nextInt();
                c1Bingo[n++]=cBingo[i][j];
            }
        }
        for (int i = 0; i < 25; i++) {
            bingo[i] = sc.nextInt();
        }

        int count=0,line;
        int x,y, z1, z2;
        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < c1Bingo.length; j++) {
                if(bingo[i]==c1Bingo[j]){
                    oBingo[j/5][j%5]=1;
                    count++;
                    break;
                }
            }
            line=0;
            z1 =0;
            z2 =0;

            for (int j = 0; j < 5; j++) {
                z1 += oBingo[j][j];
                z2 += oBingo[4-j][j];
            }
            if(z1==5) line++;
            if(z2==5) line++;

            for (int j = 0; j < 5; j++) {
                x=0;
                y=0;
                for (int k = 0; k < 5; k++) {
                    x+=oBingo[j][k];
                    y+=oBingo[k][j];
                }
                if(x==5) line++;
                if(y==5) line++;
                if(line>3) break;
            }
            if(line>0) break;
        }
        System.out.println(count);
    }
}