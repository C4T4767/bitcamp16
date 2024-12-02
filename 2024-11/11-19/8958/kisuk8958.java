import java.io.IOException;
import java.util.Scanner;

public class kisuk8958 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        sc.close();

        for(int i = 0; i < str.length; i++) {
            int cnt = 0;
            int sum = 0;
            for(int j = 0; j < str[i].length(); j++) {
                if(str[i].charAt(j) == 'O') {
                    cnt++;
                } else {
                    cnt = 0;
                }
                sum += cnt;
            }
            System.out.println(sum);
        }
    }
}
