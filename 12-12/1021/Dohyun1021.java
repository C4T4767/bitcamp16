package coding_test.dec_2nd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dohyun1021 {
    static boolean[] arr;
    static int n,m;
    static int pointer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        n = Integer.parseInt(in[0]); m = Integer.parseInt(in[1]);

        arr = new boolean[n+1];
        for(int i=1; i<=n; i++){
            arr[i] = true;
        }

        in = br.readLine().split(" ");
        pointer = 1;
        int arrLen = n;
        int result = 0;
        for(int i=0; i<m; i++){
            int target = Integer.parseInt(in[i]);
            if(target == pointer){
                arrLen--;
                plusPointer();
                arr[target] = false;
            }else{
                int plusCount = 0;
                while(target != pointer){
                    plusPointer();
                    plusCount++;
                }
                result += Math.min(plusCount, arrLen - plusCount);
                arrLen--;
                plusPointer();
                arr[target] = false;
            }
        }

        System.out.println(result);
    }

    static void plusPointer(){
        while (true) {
            if (pointer == n) pointer = 1;
            else pointer++;
            if(arr[pointer]){
                return;
            }
        }
    }
}
