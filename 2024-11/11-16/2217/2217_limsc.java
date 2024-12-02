import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] k = new int[n];
        int[] k2 = new int[n];
        int max=0;

        for (int i = 0; i < n; i++) {
            k[i] = sc.nextInt();
        }
        Arrays.sort(k);

        for (int i = 0; i < n; i++) {
            k2[i] = k[i] *(n-i);
            if(max<k2[i]) max=k2[i];
        }
        System.out.println(max);
    }
}