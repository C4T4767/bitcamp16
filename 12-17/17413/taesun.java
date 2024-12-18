import java.io.*;
import java.util.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        int length = s.length();
        Queue<String> q = new LinkedList<>();
        int head=0;
        boolean tag = false;
        for(int i=0;i<length;i++) {
            if(s.charAt(i)==' '&&!tag) {
                String str = s.substring(head,i);
                StringBuilder sb = new StringBuilder(str);
                String str2 = sb.reverse().toString();
                q.add(str2+" ");
                head=i+1;
            }
            if(s.charAt(i)=='<') {
                String str = s.substring(head,i);
                StringBuilder sb = new StringBuilder(str);
                String str2 = sb.reverse().toString();
                q.add(str2);
                head=i+1;
                tag=true;
            }
            if(s.charAt(i)=='>') {
                String str = s.substring(head,i);
                q.add("<"+str+">");
                head=i+1;
                tag=false;
            }
        }
        if(head<length){
            String str = s.substring(head,length);
            StringBuilder sb = new StringBuilder(str);
            String str2 = sb.reverse().toString();
            q.add(str2);
        }
        while(!q.isEmpty()) {
            bw.write(q.poll());
        }
        bw.flush();
    }
}
