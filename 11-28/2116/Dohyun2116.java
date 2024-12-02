package coding_test.dec_before;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dohyun2116 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =  Integer.parseInt(br.readLine());
        int[][] dice = new int[n][6];
        for(int i=0; i<n; i++){
            String[] in = br.readLine().split(" ");
            for(int j=0; j<6; j++){
                dice[i][j] = Integer.parseInt(in[j]);
            }
        }

        int max = 0;
        for(int i=0; i<6; i++){
            int sum = n*6;
            int bottom = dice[0][i];
            int top = dice[0][topIndex(i)];
            if(bottom + top == 11){
                sum -= 2;
            }else if(bottom == 6 || top == 6){
                sum -= 1;
            }
            for(int j=1; j<n; j++){
                bottom = top;
                for(int k=0; k<6; k++){
                    if(bottom == dice[j][k]){
                        top = dice[j][topIndex(k)];
                        break;
                    }
                }
                if(bottom + top == 11){
                    sum -= 2;
                }else if(bottom == 6 || top == 6){
                    sum -= 1;
                }
            }
            if(max < sum){
                max = sum;
            }
        }
        System.out.println(max);
    }

    static public int topIndex(int bottom){
        return switch (bottom) {
            case 0 -> 5;
            case 1 -> 3;
            case 2 -> 4;
            case 3 -> 1;
            case 4 -> 2;
            default -> 0;
        };
    }
}
