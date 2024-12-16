import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        int n = Integer.parseInt(s);
        for(int i=0;i<n;i++){
            char win=' ';
            s = br.readLine();
            String[] st = s.split(" ");
            int length = Integer.parseInt(st[0]);
            int[] aSquare = new int[4];
            for(int j=1;j<=length;j++){
                int num = Integer.parseInt(st[j]);
                if(num==4){
                    aSquare[0]++;
                }
                else if(num==3){
                    aSquare[1]++;
                }
                else if(num==2){
                    aSquare[2]++;
                }
                else if(num==1){
                    aSquare[3]++;
                }
            }
            s = br.readLine();
            st = s.split(" ");
            length = Integer.parseInt(st[0]);
            int[] bSquare = new int[4];
            for(int j=1;j<=length;j++){
                int num = Integer.parseInt(st[j]);
                if(num==4){
                    bSquare[0]++;
                }
                else if(num==3){
                    bSquare[1]++;
                }
                else if(num==2){
                    bSquare[2]++;
                }
                else if(num==1){
                    bSquare[3]++;
                }
            }
            if(aSquare[0]>bSquare[0]){
                win='A';
            }
            else if(aSquare[0]<bSquare[0]){
                win='B';
            }
            else{
                if(aSquare[1]>bSquare[1]){
                    win='A';
                }
                else if(aSquare[1]<bSquare[1]){
                    win='B';
                }
                else{
                    if(aSquare[2]>bSquare[2]){
                        win='A';
                    }
                    else if(aSquare[2]<bSquare[2]){
                        win='B';
                    }
                    else{
                        if(aSquare[3]>bSquare[3]){
                            win='A';
                        }
                        else if(aSquare[3]<bSquare[3]){
                            win='B';
                        }
                        else{
                            win='D';
                        }
                    }
                }
            }
            bw.write(win+"");
            if(i!=n-1){
                bw.newLine();
            }
        }
        bw.flush();
    }
}