import java.io.*;
import java.util.Arrays;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        String[] st = s.split(" ");
        int x = Integer.parseInt(st[0]);
        int y = Integer.parseInt(st[1]);
        s = br.readLine();
        int n = Integer.parseInt(s);
        int[] xx = new int[n];
        int[] yy = new int[n];
        for(int i=0;i<n;i++){
            s = br.readLine();
            st = s.split(" ");
            if (st[0].equals("0")) {
                yy[i] = Integer.parseInt(st[1]);
            }
            else{
                xx[i] = Integer.parseInt(st[1]);
            }
        }
        Arrays.sort(xx);
        Arrays.sort(yy);
        int[] xLength = new int[xx.length+1];
        int[] yLength = new int[yy.length+1];
        xLength[0] = xx[0];
        for(int i=1;i<xx.length;i++){
            xLength[i] = xx[i] - xx[i-1];
        }
        xLength[xLength.length-1] = x-xx[xx.length-1];
        yLength[0] = yy[0];
        for(int i=1;i<yy.length;i++){
            yLength[i] = yy[i] - yy[i-1];
        }
        yLength[yLength.length-1] = y-yy[yy.length-1];
        Arrays.sort(xLength);
        Arrays.sort(yLength);
        int num = xLength[xLength.length-1]*yLength[yLength.length-1];
        bw.write(num+"");
        bw.flush();
    }
}
