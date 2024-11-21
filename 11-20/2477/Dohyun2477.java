package coding_test;

import java.io.*;

public class Dohyun2477 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] in = new String[6][2];
        int Height = 0;
        int Width = 0;
        for(int i=0; i<6; i++){
            in[i] = br.readLine().split(" ");
            if(in[i][0].equals("1") || in[i][0].equals("2")){
                Width = Math.max(Integer.parseInt(in[i][1]),Width);
            }else{
                Height = Math.max(Integer.parseInt(in[i][1]),Height);
            }
        }
        int subX = 0;
        int subY = 0;
        for(int i=0; i<6; i++){
            if(in[pointer(i)][0].equals(in[pointer(i-2)][0]) && in[pointer(i+1)][0].equals(in[pointer(i-1)][0])){
                subX = Integer.parseInt(in[pointer(i)][1]);
                subY = Integer.parseInt(in[pointer(i-1)][1]);
                break;
            }
        }
        System.out.println(((Height*Width) - (subX*subY)) * n);
    }

    static int pointer(int p){
        int out = p;
        if(p>5)
            out = p-6;
        else if(p<0)
            out = 6+p;
        return out;
    }
}
