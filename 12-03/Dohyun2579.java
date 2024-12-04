package coding_test.dec_1st;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dohyun2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[][] arr2 = new int[n+1][2];
        arr2[1][0] = arr2[1][1] = arr[1];
        for(int i=2; i<=n; i++){
            arr2[i][0] = Math.max(arr2[i-2][0],arr2[i-2][1]) + arr[i];
            arr2[i][1] = arr2[i-1][0] + arr[i];
        }
        System.out.println(Math.max(arr2[n][0],arr2[n][1]));
    }
}
