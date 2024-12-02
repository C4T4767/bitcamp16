import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str;
        StringBuilder strResult= new StringBuilder();
        int x;
        int[] arr = new int[21];

        for (int i = 0; i < n; i++) {
            str = sc.next();
            switch (str){
                case "add":
                    x = sc.nextInt();
                    if (arr[x]==1) break;
                    arr[x]=1;
                    break;
                case "remove":
                    x = sc.nextInt();
                    if (arr[x]==0) break;
                    arr[x]=0;
                    break;
                case "check":
                    x = sc.nextInt();
                    strResult.append(String.valueOf(arr[x])).append("\n");
                    break;
                case "toggle":
                    x = sc.nextInt();
                    arr[x]=1-arr[x];
                    break;
                case "all":
                    Arrays.fill(arr,1);
                    break;
                case "empty":
                    Arrays.fill(arr,0);
                    break;

            }
        }
        System.out.println(strResult);
    }
}
