import java.io.*;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        String[] st = s.split(" ");
        int n = Integer.parseInt(st[0]);
        int m = Integer.parseInt(st[1]);
        int[][] stu = new int[2][6];
        for(int i=0;i<n;i++){
            s = br.readLine();
            st = s.split(" ");
            int a = Integer.parseInt(st[0]);
            int b = Integer.parseInt(st[1]);
            stu[a][b-1]++;
        }
        int count=0;
        for(int i=0;i<6;i++){
            count+=(stu[0][i]+m-1)/m;
            count+=(stu[1][i]+m-1)/m;
        }
        bw.write(count+"");
        bw.flush();
    }
}