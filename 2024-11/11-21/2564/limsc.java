import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineX = sc.nextInt();
        int lineY = sc.nextInt();
        int n = sc.nextInt();
        int[][] ql = new int[n][2];
        int sum=0, x;
        int dQ, dL;

        for (int i = 0; i < n; i++) {
            ql[i][0]= sc.nextInt();
            ql[i][1]= sc.nextInt();
        }
        dQ = sc.nextInt();
        dL = sc.nextInt();

        for (int i = 0; i < n; i++) {
            x=0;
            if(dQ==1){
                if (ql[i][0]==1){
                    x=Math.abs(ql[i][1]-dL);
                } else if (ql[i][0]==2) {
                    x=Math.min(dL+lineY+ql[i][1],(2*lineX)+lineY-ql[i][1]-dL);
                } else if (ql[i][0]==3) {
                    x=dL+ql[i][1];
                }else {
                    x=lineX-dL+ql[i][1];
                }
            } else if (dQ==2) {
                if (ql[i][0]==1){
                    x=Math.min(dL+lineY+ql[i][1],(2*lineX)+lineY-ql[i][1]-dL);
                } else if (ql[i][0]==2) {
                    x=Math.abs(ql[i][1]-dL);
                } else if (ql[i][0]==3) {
                    x=lineY-ql[i][1]+dL;
                }else {
                    x=lineX+lineY-dL-ql[i][1];
                }
            } else if (dQ==3) {
                if (ql[i][0]==1){
                    x=dL+ql[i][1];
                } else if (ql[i][0]==2) {
                    x=lineY-ql[i][1]+dL;
                } else if (ql[i][0]==3) {
                    x=Math.abs(ql[i][1]-dL);
                }else {
                    x=Math.min(dL+lineX+ql[i][1],2*lineY+lineX-ql[i][1]-dL);
                }
            }else {
                if (ql[i][0]==1){
                    x=lineX-ql[i][1]+dL;
                } else if (ql[i][0]==2) {
                    x=lineX+lineY-ql[i][1]-dL;
                } else if (ql[i][0]==3) {
                    x=Math.min(dL+lineX+ql[i][1],2*lineY+lineX-ql[i][1]-dL);
                }else {
                    x=Math.abs(ql[i][1]-dL);
                }
            }
            sum+=x;
        }
        System.out.println(sum);

    }
}