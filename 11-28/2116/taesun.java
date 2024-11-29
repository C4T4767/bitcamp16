import java.io.*;
import java.util.Arrays;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        int n = Integer.parseInt(s);
        int[][] arr = new int[n][6];
        for(int i=0;i<n;i++){
            s = br.readLine();
            String[] st = s.split(" ");
            for(int j=0;j<6;j++){
                arr[i][j] = Integer.parseInt(st[j]);
            }
        }
        int max=0;
        for(int i=0;i<6;i++){
            int top=arr[0][i];
            int sum=0;
            int bottom=flip(arr[0],top);
            if (top==6||bottom==6){
                if(top==5||bottom==5){
                    sum+=4;
                }
                else {
                    sum += 5;
                }
            }
            else{
                sum+=6;
            }
            for(int j=1;j<n;j++){
                bottom = top;
                top=flip(arr[j],bottom);
                if (top==6||bottom==6){
                    if(top==5||bottom==5){
                        sum+=4;
                    }
                    else {
                        sum += 5;
                    }
                }
                else {
                    sum+=6;
                }
            }
            max = Math.max(max,sum);
        }
        bw.write(max+"");
        bw.flush();
    }
    static int flip(int[] arr, int num){
        for(int i=0;i<6;i++){
            if (num==arr[i])
                switch(i){
                    case 0:
                        return arr[5];
                    case 1:
                        return arr[3];
                    case 2:
                        return arr[4];
                    case 3:
                        return arr[1];
                    case 4:
                        return arr[2];
                    case 5:
                        return arr[0];
                }
        }
        return 0;
    }
}
