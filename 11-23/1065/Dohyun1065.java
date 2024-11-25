package coding_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dohyun1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in = br.readLine();
        int num = Integer.parseInt(in);

        int count = 99;

        if (num > 99) {
            for (int i = 100; i <= num; i++) {
                boolean countcheck = true;
                char[] n = String.valueOf(i).toCharArray();
                for (int j = 0; j < n.length - 1; j++) {
                    if ((j > 0 && n[j - 1] - n[j] != n[j] - n[j + 1])) {
                        countcheck = false;
                        break;
                    }
                }
                if (countcheck) {
                    count++;
                }
            }
        }else{
            count = num;
        }
        System.out.println(count);
    }
}
