import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];
        int result=0;

        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = sc.nextInt();
        }
        for (int i = 0; i < arrB.length; i++) {
            arrB[i] = sc.nextInt();
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        for (int i = 0; i < n; i++) {
            result+= arrA[i]*arrB[n-1-i];
        }

        System.out.println(result);
    }
}