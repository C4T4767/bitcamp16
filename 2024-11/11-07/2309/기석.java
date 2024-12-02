import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] height = new int[9];
        int sum = 0;
        for(int i = 0; i < height.length; i++) {
            height[i] = Integer.parseInt(br.readLine());
            sum += height[i];
        }

        boolean flag = true;
        for(int i = 0; i < height.length - 1; i++) { // h[0] ~ h[7]
            for(int j = i + 1; j < height.length; j++) { // h[1] ~ h[8]
                if(sum - height[i] - height[j] == 100) {
                    height[i] = 100;
                    height[j] = 100;
                    flag = false;
                    break;
                }
            }
            if(!flag) break;
        }
        Arrays.sort(height);
        for(int i = 0; i < 7; i++) {
            System.out.println(height[i]);
        }
    }
}