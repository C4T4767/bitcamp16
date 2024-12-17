package coding_test.dec_2nd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dohyun13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //도시사이 거리
        String[] in = br.readLine().split(" ");
        int[] distance = new int[n-1];
        for(int i=0; i<n-1; i++) {
            distance[i] = Integer.parseInt(in[i]);
        }
        //도시별 기름값
        in = br.readLine().split(" ");
        int[] oilPrice = new int[n];
        for(int i=0; i<n; i++) {
            oilPrice[i] = Integer.parseInt(in[i]);
        }
        //최소기름값 구하기
        int minPrice = oilPrice[0];
        long len = 0;
        long priceSum = 0;
        for(int i=0; i<n-1; i++){
            len += distance[i];

            if(oilPrice[i+1] < minPrice || i == n-2){
                priceSum += len*minPrice;
                len = 0;
                minPrice = oilPrice[i+1];
            }
        }
        System.out.println(priceSum);
    }
}
