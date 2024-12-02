import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<N;i++){
            int ticket= sc.nextInt();
            list.add(i-ticket,i+1);
        }
        for(int i=0;i<N;i++){
            System.out.print(list.get(i)+ " ");
        }
    }
}