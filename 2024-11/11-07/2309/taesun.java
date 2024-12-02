import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int sum=0;
        for(int i=0;i<9;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int diff = sum-100;
        outerLoop:
        for(int i=0;i<9;i++){
            for(int j=i+1;j<9;j++){
                if(arr[i]+arr[j]==diff){
                    arr[i]=100;
                    arr[j]=100;
                    break outerLoop;
                }
            }
        }
        Arrays.sort(arr);
        for(int i=0;i<9;i++){
            if(arr[i]!=100) {
                System.out.println(arr[i]);
            }
        }
    }
}