import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] numArr = new int[n+1];
        int count =1;
        int p=2,i=1,x=0;
        while (count != n) {
            x=p*i;
            i++;
            if(x>n){
                i=2;
                p++;
                x=p;
            }
            if(numArr[x]!=0){
                continue;
            }else {
                numArr[x] = count;
                if (count==k) break;
                count++;
            }
        }

        System.out.println(x);

    }
}