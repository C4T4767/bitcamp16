import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> maxNumIndex = new TreeMap<>();
        int[] inputScore = new int[8];//입력받는 저장공간
        for(int i=0; i<8; i++){
            inputScore[i] = Integer.parseInt(br.readLine()); //입력 * 8
        }

        int sum = 0;
        for(int i=0; i<5;i++) { //5개
            int max = -1;
            int index = -1;
            for (int j = 0; j < 8; j++) {//가장 큰 수 찾기
                if(inputScore[j]>max){
                    max = inputScore[j];
                    index = j;
                }
            }
            sum+=max;//총합에 +
            maxNumIndex.put(index,max);//인덱스와 벨류값 동시에 저장
            inputScore[index] = -1; //삽입이 끝난 수는 -1로 초기화해서 탐색에서 제외시킴
        }
        System.out.println(sum);
        for(Map.Entry<Integer, Integer> i : maxNumIndex.entrySet()){
            System.out.print(i.getKey()+1+" ");
        }
    }
}
