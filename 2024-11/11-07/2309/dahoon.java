package 백준;

import java.util.Arrays;
import java.util.Scanner;

public class B_2309 {
    private static final int dwarf = 100;
    static int[] arr;
    static int diff;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int total = Arrays.stream(arr).sum();

        diff = total - dwarf;
        check();

        Arrays.sort(arr);
        for (int i = 2; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void check() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == diff) {
                    arr[i] = -1;
                    arr[j] = -1;
                    return;
                }
            }
        }
    }
}
