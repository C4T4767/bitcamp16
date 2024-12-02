import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        out:
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                int num = sc.nextInt();
                findNum:
                for(int k = 0; k < 5; k++) {
                    for(int l = 0; l < 5; l++) {
                        if(arr[k][l] == num ) {
                            arr[k][l] = 0;
                            break findNum;
                        }
                    }
                }
                int count=0;
                for(int k = 0; k < 5; k++) {
                    int sum=0;
                    for(int l = 0; l < 5; l++) {
                        sum+=arr[k][l];
                    }
                    if(sum==0){
                        count++;
                    }
                }
                for(int k = 0; k < 5; k++) {
                    int sum=0;
                    for(int l = 0; l < 5; l++) {
                        sum+=arr[l][k];
                    }
                    if(sum==0){
                        count++;
                    }
                }
                int sum=0;
                for(int k=0; k < 5; k++) {
                    sum+=arr[k][k];
                }
                if(sum==0){
                    count++;
                }
                sum = 0;
                for(int k=0; k < 5; k++) {
                    sum+=arr[k][4-k];
                }
                if(sum==0){
                    count++;
                }
                if(count>=3){
                    System.out.println(i*5+j+1);
                    break out;
                }
            }
        }

    }
}