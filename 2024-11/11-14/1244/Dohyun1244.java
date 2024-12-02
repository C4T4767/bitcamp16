package coding_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dohyun1244 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] swc  = new boolean[n+1];
        String[] State = br.readLine().split(" ");
        for(int i=1; i<=n; i++){
            swc[i] = State[i-1].equals("1");
        }
        int stuNum = Integer.parseInt(br.readLine());
        for(int i=0; i<stuNum; i++){
            String[] student = br.readLine().split(" ");
            int switchNum = Integer.parseInt(student[1]);
            if(student[0].equals("1")){
                for(int j=1; j<=n; j++){
                    if(j%switchNum == 0){
                        swc[j] = !swc[j];
                    }
                }
            }else{
                swc[switchNum] = !swc[switchNum];
                if(switchNum != 1 && switchNum != n){
                    int sideIndex = 1;
                    while(switchNum - sideIndex >= 1 && switchNum + sideIndex <= n){
                        int start = switchNum - sideIndex;
                        int end = switchNum + sideIndex;
                        if(swc[start] != swc[end]){
                            break;
                        }else{
                            swc[start] = !swc[start];
                            swc[end] = !swc[end];
                            sideIndex++;
                        }
                    }
                }
            }
        }

        for(int i=1; i<=n; i++){
            if(swc[i]){
                System.out.print(1+" ");
            }else{
                System.out.print(0+" ");
            }
            if(i%20 == 0){
                System.out.println();
            }
        }
    }
}
