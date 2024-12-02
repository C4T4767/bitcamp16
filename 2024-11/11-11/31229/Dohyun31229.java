import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        ArrayList<Integer> arr = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        arr.add(1000000000);
        for (int i = 1000000000-1; i > 1; i--) {
            for (int j : arr) {
                if ((long)i * j % (i + j) != 0) {
                    arr.add(i);
                    break;
                }
            }
            if(arr.size() == n){
                break;
            }
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}