import java.io.*;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        int n = Integer.parseInt(s);
        int count=0;
        if(n<100){
            count=n;
        }
        else{
            count+=99;
        }
        for(int i=101;i<=n;i++){
            if(i/10%10-i%10==i/100-i/10%10){
                count++;
            }
        }
        bw.write(count+"");
        bw.flush();
    }
}