import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        int arr = 0;
        for(int i=0;i<n;i++){
            s = br.readLine();
            String[] st = s.split(" ");
            String order = st[0];
            int num = (st.length > 1) ? Integer.parseInt(st[1]) : 0;
            int mask=0;
            switch (order) {
                case "add":
                    mask = 1 << (num-1);
                    arr = arr | mask;
                    break;
                case "remove":
                    mask = ~(1 << (num-1));
                    arr = arr & mask;
                    break;
                case "check":
                    mask = 1 <<(num-1);
                    if((arr&mask)!=0){
                        bw.write(1+"\n");
                    }
                    else{
                        bw.write(0+"\n");
                    }
                    break;
                case "toggle":
                    arr = arr ^ (1 << (num - 1));
                    break;
                case "all":
                    arr = 1048575;//2의20승-1
                    break;
                case "empty":
                    arr = 0;
                    break;
            }
        }
        bw.flush();
    }
}