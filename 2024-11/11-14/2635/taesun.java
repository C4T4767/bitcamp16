import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max=0;
        ArrayList<Integer> maxArr = new ArrayList<>();
        int count=0;
        if(n==1){
            System.out.println(4);
            System.out.println("1 1 0 1");
        }
        else {
            for (int i = 1; i < n; i++) {
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(n);
                arr.add(i);
                count = 2;
                while (true) {
                    arr.add( arr.get(count - 2) - arr.get(count - 1));
                    if (arr.get(count) >= 0) {
                        count++;
                    } else {
                        if (max < count) {
                            maxArr = new ArrayList<>(arr);
                            max = count;
                        }
                        break;
                    }
                }
            }
            System.out.println(max);
            for (int i = 0; i < max; i++) {
                System.out.print(maxArr.get(i)+ " ");
            }
        }

    }
}
