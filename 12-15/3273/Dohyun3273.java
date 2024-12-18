package coding_test.dec_3rd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Dohyun3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] in = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(in[i]);
        }

        int sum = Integer.parseInt(br.readLine());
        int cnt = 0;

        Arrays.sort(arr);
        int end=n-1;
        for(int i=0; i<end; i++){
            for(int j=end; j>i; j--) {
                if (arr[i]+arr[j] == sum) {
                    end = j-1;
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
