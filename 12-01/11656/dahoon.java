import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        String[] s = new String[word.length()];
        for (int i = 0; i < word.length(); i++) {
            s[i] = word.substring(i);
        }

        Arrays.sort(s);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
