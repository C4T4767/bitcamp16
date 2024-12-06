package coding_test.dec_1st;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dohyun13300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] student = new int[6][2];
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int div = Integer.parseInt(in[1]);
        for(int i=0; i<n; i++){
            in = br.readLine().split(" ");
            int gender = Integer.parseInt(in[0]);
            int grade = Integer.parseInt(in[1]);
            student[grade-1][gender]++;
        }
        int sum = 0;
        for(int i=0; i<6; i++){
            for(int j=0; j<2; j++){
                if(student[i][j]%div == 0){
                    sum += student[i][j]/div;
                }else{
                    sum += student[i][j]/div+1;
                }
            }
        }
        System.out.println(sum);
    }
}
