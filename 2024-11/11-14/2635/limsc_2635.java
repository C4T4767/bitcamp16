import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        String strAnswer="";

        for (int i = n; i > 0; i--) {
            int x = n, count = 2, tmp1, tmp2;
            String str = n+" "+i;
            tmp1 = x;
            tmp2 = i;
            while (true) {
                x = tmp1 - tmp2;
                tmp1 = tmp2;
                tmp2 = x;
                if(x < 0) break;
                str += " " + x;
                count++;
            }
            if (max < count) {
                max = count;
                strAnswer = str;
            }
        }
        System.out.println(max +"\n"+strAnswer);
    }
}