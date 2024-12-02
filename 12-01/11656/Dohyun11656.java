package coding_test.dec_1st;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Dohyun11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        Integer[] subString = new Integer[in.length()];
        for(int i=0; i<in.length(); i++){
            subString[i] = i;
        }
        Arrays.sort(subString, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return in.substring(o1).compareTo(in.substring(o2));
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<in.length(); i++){
            sb.append(in.substring(subString[i])).append('\n');
        }
        System.out.println(sb);
    }
}
