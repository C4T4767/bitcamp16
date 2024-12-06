package coding_test.dec_1st;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dohyun2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]), k = Integer.parseInt(in[1]);
        in = br.readLine().split(" ");

        int max=0;
        for(int i=0; i<k; i++){
            max += Integer.parseInt(in[i]);
        }

        int temp = max;
        for(int i=0; i<n-k; i++){
            temp -= Integer.parseInt(in[i]);
            temp += Integer.parseInt(in[i+k]);
            max = Math.max(temp,max);
        }
        System.out.println(max);
    }
}
