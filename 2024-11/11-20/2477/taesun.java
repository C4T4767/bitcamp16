    import java.io.*;
    import java.util.Arrays;

    public class Main {
        public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        public static void main(String[] args) throws IOException {
            String s = br.readLine();
            int n = Integer.parseInt(s);
            int[] dir = new int[6];
            int[] arr = new int[6];
            int[] length = new int[5];
            int large = 1;
            int small = 1;
            for(int i=0;i<6;i++){
                s = br.readLine();
                String[] st = s.split(" ");
                dir[i] = Integer.parseInt(st[0]);
                arr[i] = Integer.parseInt(st[1]);
                length[dir[i]]+=arr[i];
            }
            for(int i=0;i<6;i++){
                int next=(i+1)%6;
                if(dir[i]==4&&dir[next]==1){
                    small=arr[i]*arr[next];
                }
                else if(dir[i]==1&&dir[next]==3){
                    small=arr[i]*arr[next];
                }
                else if(dir[i]==2&&dir[next]==4){
                    small=arr[i]*arr[next];
                }
                else if(dir[i]==3&&dir[next]==2){
                    small=arr[i]*arr[next];
                }
            }
            Arrays.sort(length);
            large=length[1]*length[3];
            int num = (large-small)*n;
            bw.write(num+"");
            bw.flush();
        }
    }