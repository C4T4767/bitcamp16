package coding_test.dec_1st;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dohyun10163 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte[][] rec = new byte[1001][1001];
        byte n = Byte.parseByte(br.readLine());
        for(byte i=1; i<=n; i++) {
            String[] in = br.readLine().split(" ");
            int startX = Integer.parseInt(in[0]);
            int startY = Integer.parseInt(in[1]);
            int lenX = Integer.parseInt(in[2]);
            int lenY = Integer.parseInt(in[3]);

            for(int x=startX;x<startX+lenX;x++){
               for(int y=startY;y<startY+lenY;y++){
                   rec[x][y] = i;
               }
            }
        }

        int[] arr = new int[n+1];
        for(int x=0;x<1001;x++){
            for(int y=0;y<1001;y++){
                arr[rec[x][y]]++;
            }
        }

        StringBuilder sb= new StringBuilder();
        for(int i=1; i<=n; i++){
            sb.append(arr[i]).append('\n');
        }
        System.out.println(sb);
    }
}
