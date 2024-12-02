import java.io.*;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int[] stuLine = new int[Integer.parseInt(br.readLine())];
        Arrays.setAll(stuLine, i -> i+1);

        String[] tagStr = br.readLine().split(" ");
        int[] tags = new int[tagStr.length];
        for(int i=0; i< tagStr.length; i++)
            tags[i] = Integer.parseInt(tagStr[i]);

        for(int i = 0; i < tags.length; i++) {
            int tag = tags[i];
            int temp = -1;
            if(tag != 0){
                temp = stuLine[i];
            }
            for(int j=i; j>i-tag; j--){
                stuLine[j] = stuLine[j - 1];
            }
            if(temp != -1){
                stuLine[i-tag] = temp;
            }
        }

        for(int i=0; i<stuLine.length; i++){
            System.out.print(stuLine[i]+" ");
        }
    }
}