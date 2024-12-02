package coding_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dohyun2563 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        boolean[][] rectangle = new boolean[100][100];
        for(int i=0; i<n; i++){
            String[] in = br.readLine().split(" ");
            int x = Integer.parseInt(in[0]);
            int y = Integer.parseInt(in[1]);
            for(int j=x-1; j<x+9; j++){
                for(int k=y-1; k<y+9; k++){
                    if(!rectangle[j][k]){
                        rectangle[j][k] = true;
                    }
                }
            }
        }
        int Area = 0;
        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                if(rectangle[i][j]){
                    Area++;
                }
            }
        }
        System.out.println(Area);
    }
}