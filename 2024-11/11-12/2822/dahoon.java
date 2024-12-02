import java.util.Arrays;
import java.util.Scanner;

class Problem implements Comparable<Problem> {
    int idx;
    int value;

    public Problem(int idx, int value) {
        this.idx = idx;
        this.value = value;
    }

    @Override
    public int compareTo(Problem o) {
        return o.value - this.value;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problem[] scores = new Problem[8];
        for (int i = 0; i < 8; i++) {
            scores[i] = new Problem(i + 1, sc.nextInt());
        }
        Arrays.sort(scores);

        int sum = 0;
        int[] idxArr = new int[5];
        for (int i = 0; i < 5; i++) {
            sum += scores[i].value;
            idxArr[i] = scores[i].idx;
        }
        Arrays.sort(idxArr);

        System.out.println(sum);
        for (int idx : idxArr) {
            System.out.print(idx + " ");
        }
    }
}
