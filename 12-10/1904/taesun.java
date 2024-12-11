import java.io.*;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        int n = Integer.parseInt(s);
        int[] arr = new int[n+2];
        arr[1]=1;
        arr[2]=2;
        for(int i=3;i<=n;i++) {
            arr[i] = arr[i-1]%15746+arr[i-2]%15746;
        }
        bw.write(arr[n]%15746+"");
        bw.flush();
    }
}