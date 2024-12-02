import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] area = new boolean[100][100];
        for(int i=0; i<4; i++) {
            String[] rec = br.readLine().split(" ");
            checkArea(area, rec);
        }

        int recArea = 0;
        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                if(area[i][j])
                    recArea++;
            }
        }
        System.out.println(recArea);
    }
    static void checkArea(boolean[][] area, String[] rec){
        int[] recPoint = new int[4];
        for (int i = 0; i < 4; i++) {
            recPoint[i] = Integer.parseInt(rec[i]);
        }
        for(int i=recPoint[0]; i<recPoint[2]; i++){
            for(int j=recPoint[1]; j<recPoint[3]; j++){
                area[i][j] = true;
            }
        }
    }
}

