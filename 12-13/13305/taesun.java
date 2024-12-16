import com.sun.security.jgss.GSSUtil;

import java.io.*;
import java.util.*;


public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        int n = Integer.parseInt(s);
        long[] dist = new long[n-1];
        long[] oil = new long[n-1];
        s = br.readLine();
        String[] st = s.split(" ");
        for (int i = 0; i < n-1; i++) {
            dist[i] = Long.parseLong(st[i]);
        }
        s = br.readLine();
        st = s.split(" ");
        for(int i=0;i<n-1;i++) {
            oil[i] = Long.parseLong(st[i]);
        }
        long sum=0;
        for(int i=0;i<n-1;i++) {
            long distSum=0;
            distSum+=dist[i];
            dist[i]=0;
            for(int j=i+1;j<n-1;j++) {
                if(oil[i]>oil[j]){
                    break;
                }
                distSum+=dist[j];
                dist[j]=0;
            }
            sum+=distSum*oil[i];
        }
        bw.write(sum+"");
        bw.flush();
    }
}