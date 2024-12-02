import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count=0;
        out:
        for(int i=0;i<1000000000;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    break;
                }
                if(j==i-1){
                    System.out.println(i+" ");
                    count++;
                    if(count==N){
                        break out;
                    }
                }
            }
        }
    }
}
