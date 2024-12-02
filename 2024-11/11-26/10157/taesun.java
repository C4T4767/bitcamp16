import java.io.*;
import java.util.Arrays;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        String[] st = s.split(" ");
        int C = Integer.parseInt(st[0]);
        int R = Integer.parseInt(st[1]);
        s = br.readLine();
        int K = Integer.parseInt(s);
        boolean[][] visited = new boolean[C+2][R+2];

        //1 동 2 서 3 남 4 북
        int dir = 4;
        int x = 1;
        int y = 0;
        int count=0;
        if(K>C*R){
            bw.write("0");
        }
        else {
            while (true) {
                if(dir==4){
                    if(y==R||visited[x][y+1]){
                        dir=1;
                    }
                    else{
                        y++;
                        visited[x][y]=true;
                        count++;
                    }
                }
                else if(dir==3){
                    if(y==1||visited[x][y-1]){
                        dir=2;
                    }
                    else{
                        y--;
                        visited[x][y]=true;
                        count++;
                    }
                }
                else if(dir==2){
                    if(x==1||visited[x-1][y]){
                        dir=4;
                    }
                    else{
                        x--;
                        visited[x][y]=true;
                        count++;
                    }
                }
                else if(dir==1){
                    if(x==C||visited[x+1][y]){
                        dir=3;
                    }
                    else{
                        x++;
                        visited[x][y]=true;
                        count++;
                    }
                }
                if(count==K){
                    bw.write(x+" "+y);
                    break;
                }
            }
        }
        bw.flush();
    }
}
