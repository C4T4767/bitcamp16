package coding_test.dec_2nd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dohyun1904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[2];
        arr[0] = 1; arr[1] = 2;
        for (int i=1; i<n; i++){
            int temp = arr[0]+arr[1];
            arr[0] = arr[1];
            arr[1] = temp % 15746;
        }
        System.out.println(arr[0]);
    }
}
