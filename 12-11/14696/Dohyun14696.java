package coding_test.dec_2nd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dohyun14696 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] in;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            int[] cardA = new int[5], cardB = new int[5];
            in = br.readLine().split(" ");
            for(int j=1; j<in.length; j++){
                cardA[Integer.parseInt(in[j])]++;
            }
            in = br.readLine().split(" ");
            for(int j=1; j<in.length; j++){
                cardB[Integer.parseInt(in[j])]++;
            }

            Boolean win = null;
            for(int j=4; j>=1; j--){
                if(cardA[j] > cardB[j]){
                    win = true;
                    break;
                }else if(cardA[j] < cardB[j]){
                    win = false;
                    break;
                }
            }

            if(win == null){
                sb.append("D\n");
            }else if(win){
                sb.append("A\n");
            }else{
                sb.append("B\n");
            }
        }
        System.out.println(sb);
    }
}
