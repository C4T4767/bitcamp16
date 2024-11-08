import java.util.Arrays;
import java.util.Scanner;

public class 성철_20241108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] realDwarfs = new int[7];
        int[] nineDwarfs = new int[9];
        int sum=0;
        int fake1 =0, fake2 =0,n=0;

        for (int i = 0; i < 9; i++) {
            nineDwarfs[i] = sc.nextInt();
            sum+= nineDwarfs[i];
        }
        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
                if(sum-100== nineDwarfs[i]+ nineDwarfs[j]){
                    fake1 =i;
                    fake2 =j;
                    break;
                }
            }
            if(fake1 >0){
                break;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (i != fake1 && i != fake2) {
                realDwarfs[n++]= nineDwarfs[i];
            }
        }
        Arrays.sort(realDwarfs);
        for (int i = 0; i < 7; i++) {
            System.out.println(realDwarfs[i]);
        }
    }
}