import java.io.*;
import java.util.Scanner;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        int n = Integer.parseInt(s);
        s = br.readLine();
        String[] st = s.split(" ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st[i]);
        }
        int prev = arr[0];
        int larger = 1;
        int largest = 1;
        int smaller = 1;
        int smallest = 1;
        for(int i=1;i<n;i++){
            if(arr[i]>prev){
                larger++;
                largest = Math.max(larger,largest);
                smaller=1;
            }
            else if(arr[i]<prev){
                smaller++;
                smallest = Math.max(smaller,smallest);
                larger=1;
            }
            else{
                smaller++;
                larger++;
                largest = Math.max(larger,largest);
                smallest = Math.max(smaller,smallest);
            }
            prev=arr[i];
        }
        bw.write(Math.max(largest,smallest)+"");
        bw.flush();
    }
}