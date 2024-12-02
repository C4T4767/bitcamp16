import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Dohyun1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Integer[] A = new Integer[n];
        int[] sortedA = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        String[] strA = br.readLine().split(" ");
        String[] strB = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(strA[i]);
            map.put(i,Integer.parseInt(strB[i]));
        }

        Arrays.sort(A, Comparator.reverseOrder());
        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        for (int i=0; i<n; i++) {
            int index = list.get(i).getKey();
            sortedA[index] = A[i];
        }

        int sum=0;
        for(int i=0; i<n; i++){
            sum+=sortedA[i] * Integer.parseInt(strB[i]);
        }
        System.out.println(sum);
    }
}