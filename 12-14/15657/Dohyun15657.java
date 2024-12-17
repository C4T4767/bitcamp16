package coding_test.dec_3rd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Dohyun15657 {
    static int[] arr;
    static int[] visit;
    static int n, m;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        n = Integer.parseInt(in[0]);
        m = Integer.parseInt(in[1]);

        arr = new int[n];
        visit = new int[n];
        in = br.readLine().split(" ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(in[i]);
        }

        Arrays.sort(arr);
        backTracking(0,0);
        System.out.println(sb);
    }

    static void backTracking(int visited, int before){
        if(visited == m){
            for(int i=0; i<n; i++) {
                for (int j = 0; j < visit[i]; j++) {
                    sb.append(arr[i]).append(' ');
                }
            }
            sb.append('\n');
            return;
        }
        for(int i=0; i<n; i++){
            if(before <= arr[i]) {
                visit[i]++;
                backTracking(visited + 1,arr[i]);
                visit[i]--;
            }
        }
    }
}
