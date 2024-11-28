import java.io.*;
import java.util.Arrays;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        String[] st = s.split(" ");
        int width = Integer.parseInt(st[0]);
        int height = Integer.parseInt(st[1]);
        s = br.readLine();
        st = s.split(" ");
        int p = Integer.parseInt(st[0]);
        int q = Integer.parseInt(st[1]);
        s = br.readLine();
        int t = Integer.parseInt(s);
        p=p+t;
        q=q+t;
        int count=p/width;
        if(count>0&&count%2!=0){
            p=width-p%width;
        }
        else{
            p=p%width;
        }
        count=q/height;
        if(count>0&&count%2!=0){
            q=height-q%height;
        }
        else{
            q=q%height;
        }
        bw.write(p+" "+q);
        bw.flush();
    }
}
