package coding_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Dohyun2628 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        int x = Integer.parseInt(in[1]);
        int y = Integer.parseInt(in[0]);

        ArrayList<SPEP> listX = new ArrayList<>();
        ArrayList<SPEP> listY = new ArrayList<>();
        listX.add(new SPEP(0,x));
        listY.add(new SPEP(0,y));

        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            in = br.readLine().split(" ");
            int mid = Integer.parseInt(in[1]);
            if(in[0].equals("0")){
                for(int j=0; j<listX.size(); j++){
                    if(listX.get(j).includeNum(mid)){
                        SPEP[] div = division(listX.get(j),mid);
                        listX.remove(j);
                        listX.add(div[0]);
                        listX.add(div[1]);
                        break;
                    }
                }
            }else{
                for(int j=0; j<listY.size(); j++){
                    if(listY.get(j).includeNum(mid)){
                        SPEP[] div = division(listY.get(j),mid);
                        listY.remove(j);
                        listY.add(div[0]);
                        listY.add(div[1]);
                        break;
                    }
                }
            }
        }
        int maxX=0, maxY=0;
        for(SPEP t : listX){
            if(maxX<t.len()) {
                maxX = t.len();
            }
        }
        for(SPEP t : listY){
            if(maxY<t.len()) {
                maxY = t.len();
            }
        }
        System.out.println(maxX*maxY);
    }

    static SPEP[] division(SPEP target, int mid){
        SPEP[] result = new SPEP[2];
        result[0] = new SPEP(target.start, mid);
        result[1] = new SPEP(mid, target.end);
        return result;
    }

    static class SPEP{
        int start;
        int end;

        SPEP(int start, int end) {
            this.start = start;
            this.end = end;
        }

        int len(){
            return end-start;
        }

        boolean includeNum(int num){
            if(start < num && num < end){
                return true;
            }else
                return false;
        }
    }
}
