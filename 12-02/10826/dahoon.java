import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        BigInteger[] arr = new BigInteger[10001];
        arr[0] = new BigInteger("0");
        arr[1] = new BigInteger("1");
        for (int i = 2; i < 10001; i++) {
            arr[i] = arr[i - 2].add(arr[i - 1]);
        }

        System.out.println(arr[N]);
    }
}
