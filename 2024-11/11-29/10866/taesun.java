import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        int n = Integer.parseInt(s);
        int[] deque = new int[n*2];
        int front = n;
        int back = n;
        int count=0;
        for(int i=0;i<n;i++){
            s = br.readLine();
            String[] st = s.split(" ");
            switch(st[0]){
                case "push_front":
                    int num = Integer.parseInt(st[1]);
                    if(count>0){
                        front--;
                    }
                    deque[front] = num;
                    count++;
                    break;
                case "push_back":
                    num = Integer.parseInt(st[1]);
                    if(count>0){
                        back++;
                    }
                    count++;
                    deque[back] = num;
                    break;
                case "pop_front":
                    if(count==0){
                        bw.write("-1");
                        if(i!=n-1){
                            bw.newLine();
                        }
                    }
                    else {
                        num = deque[front];
                        if(count>1) {
                            front++;
                        }
                        count--;
                        bw.write(num + "");
                        if(i!=n-1){
                            bw.newLine();
                        }
                    }
                    break;
                case "pop_back":
                    if(count==0){
                        bw.write("-1");
                        if(i!=n-1){
                            bw.newLine();
                        }
                    }
                    else {
                        num = deque[back];
                        if(count>1) {
                            back--;
                        }
                        count--;
                        bw.write(num + "");
                        if(i!=n-1){
                            bw.newLine();
                        }
                    }
                    break;
                case "size":
                    bw.write(count+"");
                    if(i!=n-1){
                        bw.newLine();
                    }
                    break;
                case "empty":
                    if(count==0){
                        bw.write("1");
                        if(i!=n-1){
                            bw.newLine();
                        }
                    }
                    else{
                        bw.write("0");
                        if(i!=n-1){
                            bw.newLine();
                        }
                    }
                    break;
                case "front":
                    if(count==0){
                        bw.write("-1");
                        if(i!=n-1){
                            bw.newLine();
                        }
                    }
                    else{
                        num = deque[front];
                        bw.write(num + "");
                        if(i!=n-1){
                            bw.newLine();
                        }
                    }
                    break;
                case "back":
                    if(count==0){
                        bw.write("-1");
                        if(i!=n-1){
                            bw.newLine();
                        }
                    }
                    else{
                        num = deque[back];
                        bw.write(num + "");
                        if(i!=n-1){
                            bw.newLine();
                        }
                    }
                    break;
            }
        }
        bw.flush();
    }
}
