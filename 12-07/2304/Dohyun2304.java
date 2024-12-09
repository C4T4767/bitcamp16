package coding_test.dec_1st;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Dohyun2304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] pillar = new int[1001];
        int n = Integer.parseInt(br.readLine());

        int[] start = new int[2];
        int[] end = new int[2];
        start[0] = 1000;
        for(int i=0; i<n; i++){
            String[] in = br.readLine().split(" ");
            int index = Integer.parseInt(in[0]);
            int height = Integer.parseInt(in[1]);
            pillar[index] = height;
            if(start[0]>index){
                start[0] = index;
                start[1] = height;
            }
            if(end[0]<index){
                end[0] = index;
                end[1] = height;
            }
        }

        ArrayList<int[]> up = new ArrayList<>();
        ArrayList<int[]> down = new ArrayList<>();
        up.add(start); down.add(start);
        loop:
        for(int i=start[0]+1; i<=end[0]; i++){
            if(pillar[i] != 0){
                for(int j=down.size()-1; j>=0; j--){
                    if(pillar[i] > down.get(j)[1]){
                        down.remove(j);
                    }else{
                        down.add(new int[]{i, pillar[i]});
                        continue loop;
                    }
                }
                down.add(new int[]{i, pillar[i]});
                up.add(new int[]{i, pillar[i]});
            }
        }
        int area = 0;
        area += up.get(up.size()-1)[1];
        for(int i=0; i<up.size()-1; i++){
            area += up.get(i)[1] * (up.get(i+1)[0] - up.get(i)[0]);
        }
        for(int i=0; i<down.size()-1; i++){
            area += down.get(i+1)[1] * (down.get(i+1)[0] - down.get(i)[0]);
        }
        System.out.println(area);
    }
}