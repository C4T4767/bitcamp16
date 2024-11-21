import java.io.*;
import java.util.Arrays;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        String[] st = s.split(" ");
        int n = Integer.parseInt(st[0]);
        int m = Integer.parseInt(st[1]);
        s= br.readLine();
        int num= Integer.parseInt(s);
        int[][] arr = new int[num+1][2];
        for(int i=0;i<=num;i++){
            s = br.readLine();
            st = s.split(" ");
            arr[i][0]=Integer.parseInt(st[0]);
            arr[i][1]=Integer.parseInt(st[1]);
        }
        int sum=0;
        int[] newArr = new int[num+1];
        for(int i=0;i<=num;i++){
            if(arr[i][0]==1){
                newArr[i]=n-arr[i][1];
            }
            else if(arr[i][0]==2){
                newArr[i]=n+m+arr[i][1];
            }
            else if(arr[i][0]==3){
                newArr[i]=n+arr[i][1];
            }
            else{
                newArr[i]=2*n+2*m-arr[i][1];
            }
        }
        for(int i=0;i<num;i++){
            int dist1 = Math.abs(newArr[i]-newArr[num]);
            int dist2 = 2*n+2*m-dist1;
            int min = Math.min(dist1,dist2);
            sum+=min;
        }
        bw.write(sum+"");
        bw.flush();
    }
}
