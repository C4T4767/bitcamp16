import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        boolean[] switch0 = new boolean[n];
        s = br.readLine();
        String[] st = s.split(" ");
        for(int i = 0; i < n; i++) {
            if(st[i].equals("0")){
                switch0[i] = false;
            }
            else{
                switch0[i] = true;
            }
        }
        s = br.readLine();
        int m = Integer.parseInt(s);
        for(int i=0;i<m;i++){
            s = br.readLine();
            st = s.split(" ");
            int gender = Integer.parseInt(st[0]);
            int num = Integer.parseInt(st[1]);
            if(gender == 1){
                for(int j=num-1;j<n;j+=num){
                    switch0[j] = !switch0[j];
                }
            }
            else{
                switch0[num-1]=!switch0[num-1];
                int count=1;
                while(num-1-count>=0&&num-1+count<n){
                    if(switch0[num-1-count]==switch0[num-1+count]){
                        switch0[num-1-count]=!switch0[num-1-count];
                        switch0[num-1+count]=!switch0[num-1+count];
                        count++;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            if(switch0[i]){
                bw.write("1");
            }
            else{
                bw.write("0");
            }
            if(i!=n-1){
                bw.write(" ");
            }
            if((i+1)%20==0&&i>1){
                bw.write("\n");
            }
        }
        bw.flush();

    }
}
