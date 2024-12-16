import java.io.*;
import java.util.*;


public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        String[] st = s.split(" ");
        int n = Integer.parseInt(st[0]);
        int m = Integer.parseInt(st[1]);
        Deque<Integer> deque = new LinkedList();
        for (int i=1;i<=n;i++){
            deque.addLast(i);
        }
        s = br.readLine();
        st = s.split(" ");
        int count=0;
        for(int i=0;i<m;i++){
            int findNum = Integer.parseInt(st[i]);
            int num = deque.peekFirst();
            if(num==findNum){
                deque.removeFirst();
            }
            else{
                int idx = 0;
                for(Integer number : deque){
                    if(number == findNum){
                        break;
                    }
                    idx++;
                }
                int size = deque.size();
                int left = size-idx;
                int right = idx;
                if(left>right){
                    while(true){
                        int num2 = deque.pollFirst();
                        if(num2==findNum){
                            break;
                        }
                        else{
                            count++;
                            deque.addLast(num2);
                        }
                    }
                }
                else{
                    while(true){
                        int num2 = deque.peekFirst();
                        if(num2==findNum){
                            deque.removeFirst();
                            break;
                        }
                        else{
                            count++;
                            deque.addFirst(deque.pollLast());
                        }
                    }
                }
            }
        }
        bw.write(count+"");
        bw.flush();
    }
}