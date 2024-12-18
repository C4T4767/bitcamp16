import com.sun.security.jgss.GSSUtil;

import java.io.*;
import java.util.*;


public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static int n;
    public static int[] num;
    public static boolean[] visited;
    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        n = Integer.parseInt(s);
        num = new int[n];
        visited = new boolean[n];
        dp(0);
        bw.flush();
    }
    public static void dp(int i) throws IOException {
        if(i == n){
            for (int j = 0; j < n; j++) {
                bw.write(num[j] + " ");
            }
            bw.newLine();
        }
        else{
            for(int j = 0; j < n; j++){
                if(!visited[j]) {
                    visited[j] = true;
                    num[i] = j + 1;
                    dp(i + 1);
                    visited[j] = false;
                }
            }
        }
    }
}