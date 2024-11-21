package coding_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dohyun2527 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int x=0; x<4; x++) {
            String[] in = br.readLine().split(" ");
            int[] rec1 = new int[5];
            int[] rec2 = new int[5];
            for (int i = 0; i < in.length; i++) {
                if (i < 4) {
                    rec1[i+1] = Integer.parseInt(in[i]);
                } else {
                    rec2[i-3] = Integer.parseInt(in[i]);
                }
            }
            if(rec1[3]<rec2[1] || rec1[4]<rec2[2] || rec1[1]>rec2[3] || rec1[2]>rec2[4]){
                System.out.println("d");//어느 한쪽 x최소값이 다른 한쪽 x최대값보다 큰경우, 어느 한쪽 y최소값이 다른 한쪽 y최대값보다 큰경우
            }else if((rec1[1]==rec2[3] && rec1[2]==rec2[4]) || (rec1[3]==rec2[1] && rec1[4]==rec2[2])
                    || (rec1[3]==rec2[1] && rec1[2]==rec2[4]) || (rec1[1]==rec2[3] && rec1[4]==rec2[2])){
                System.out.println("c");//꼭지점끼리 만날 수 있는 4가지
            }else if(rec1[1] == rec2[3] || rec1[3] == rec2[1] || rec1[2] == rec2[4] || rec1[4] == rec2[2]){
                System.out.println("b");//면이 바깥쪽으로 만나는 경우 4가지
            }else{
                System.out.println("a");//그 외
            }
        }
    }
}
