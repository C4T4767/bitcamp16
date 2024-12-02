package coding_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Dohyun2635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        Integer input = Integer.parseInt(br.readLine());
        for (int i=0; i<=input; i++) {
            ArrayList<Integer> tempArr = new ArrayList<>();
            int index = 0;
            tempArr.add(input);
            tempArr.add(i);
            while (true) {
                int next = tempArr.get(index) - tempArr.get(index + 1);
                if (next >= 0) {
                    tempArr.add(next);
                    index++;
                }else{
                    break;
                }
            }
            if(tempArr.size()>arr.size()){
                arr = tempArr;
            }
        }
        System.out.println(arr.size());
        for(Integer i : arr){
            System.out.print(i+" ");
        }
    }
}
