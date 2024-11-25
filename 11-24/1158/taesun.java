import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        String[] st = s.split(" ");
        int n = Integer.parseInt(st[0]);
        int m = Integer.parseInt(st[1]);
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i=0;i<n;i++){
            q.add(i+1);
        }
        bw.write("<");
        int count=0;
        while(!q.isEmpty()) {
            count++;
            int num = q.poll();
            if(count % m == 0) {
                bw.write(num+"");
                if (!q.isEmpty()) {
                    bw.write(", ");
                }
            } else {
                q.add(num);
            }
        }

        bw.write(">");
        bw.flush();
        bw.close();
    }
}
