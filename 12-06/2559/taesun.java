import java.io.*;
public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        String[] st = s.split(" ");
        int n = Integer.parseInt(st[0]);
        int m = Integer.parseInt(st[1]);
        int[] sums = new int[n+1];
        sums[0] = 0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        s = br.readLine();
        st = s.split(" ");
        for(int i=0;i<n;i++){
            sum+=Integer.parseInt(st[i]);
            sums[i+1]=sum;
        }
        for(int i=m;i<n+1;i++){
                int num = sums[i]-sums[i-m];
                max = Math.max(max,num);
            }
        bw.write(max+"");
        bw.flush();

    }
}
