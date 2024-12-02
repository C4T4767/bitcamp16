import java.io.*;
import java.util.Arrays;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        String[] ss = new String[s.length()];
        int length=s.length();
        for(int i = 0; i < length; i++){
            ss[i] = s.substring(i,length);
        }
        Arrays.sort(ss);
        for(int i=0;i<length;i++){
            bw.write(ss[i]);
            if(i!=length-1){
                bw.write("\n");
            }
        }
        bw.flush();
    }
}
