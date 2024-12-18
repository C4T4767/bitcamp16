package coding_test.dec_3rd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dohyun10974 {
    static int[] result;
    static boolean[] visit;
    static int n;
    static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        result = new int[n];
        visit = new boolean[n];
        dfs(0);
        System.out.println(sb);
    }

    static void dfs(int depth){
        if(depth == n){
            for(int i=0; i<n; i++){
                sb.append(result[i]).append(' ');
            }
            sb.append('\n');
        }

        for(int i=0; i<n; i++){
            if(!visit[i]){
                visit[i] = true;
                result[depth] = i+1;
                dfs(depth+1);
                visit[i] = false;
            }
        }
    }
}
