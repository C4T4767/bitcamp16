package coding_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Dohyun10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] numbers = br.readLine().toCharArray();
        Integer[] numbersInt = new Integer[numbers.length];
        for(int i=0; i<numbers.length; i++){
            numbersInt[i] = Character.getNumericValue(numbers[i]);
        }
        System.out.println(mulOf30(numbersInt));
    }

    static String mulOf30(Integer[] numbersInt){
        boolean haveZero = false;
        int sum = 0;
        for(int i=0; i<numbersInt.length; i++){
            sum += numbersInt[i];
            if(numbersInt[i] == 0){
                haveZero = true;
            }
        }
        if(haveZero && sum%3 == 0) {
            Arrays.sort(numbersInt, Collections.reverseOrder());
            StringBuilder result = new StringBuilder();
            for (Integer num : numbersInt) {
                result.append(num);
            }
            return result.toString();
        }else{
            return "-1";
        }
    }
}
