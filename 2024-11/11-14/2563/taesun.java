import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean[][] arr = new boolean[100][100];
        int N = sc.nextInt();
        int count=0;
        for(int i=0;i<N;i++){
            int a = sc.nextInt();
            int b= sc.nextInt();
            for(int j=a;j<a+10;j++){
                for(int k=b;k<b+10;k++){
                    arr[j][k] = true;
                }
            }
        }
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(arr[i][j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}