import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        String[] sArr = str.split("");

        Queue<String> q = new LinkedList<>();
        for (String s : sArr) {
            q.add(s);
        }

        StringBuilder sb = new StringBuilder();
        while (!q.isEmpty()) {
            if (q.peek().equals("<")) {  // 태그일경우
                while (!q.isEmpty() && !q.peek().equals(">")) {
                    bw.write(q.poll());
                }
                if (!q.isEmpty()) {
                    bw.write(q.poll());
                }
            } else if (!q.peek().equals(" ")) {  // 태그가 아닐경우
                while (!q.isEmpty() && !q.peek().equals(" ") && !q.peek().equals("<")) {
                    sb.append(q.poll());
                }
                bw.write(reverse(sb.toString()));
                sb = new StringBuilder();
            } else {  // 공백일경우
                bw.write(q.poll());
            }
        }

        bw.write("\n");
        bw.flush();
        bw.close();
        br.close();
    }

    private static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        char[] cArr = s.toCharArray();
        for (int i = cArr.length - 1; i >= 0; i--) {
            sb.append(cArr[i]);
        }
        return sb.toString();
    }
}
