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
        s = br.readLine();
        st = s.split(" ");
        int count=0;
        int[] sums = new int[n+1];
        sums[0]=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Integer.parseInt(st[i]);
            sums[i+1]=sum;
        }
        for(int i=0;i<n+1;i++){
            for(int j=i+1;j<n+1;j++){
                if(sums[j]-sums[i]==m){
                    count++;
                }
            }
        }
        bw.write(count+"");
        bw.flush();
    }
}
