import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int[] numArr = new int[10];
        String strResult="";
        int sum=0;

        for (int i = 0; i < num.length(); i++) {
            numArr[(num.charAt(i)-'0')]++;
        }
        for (int i = 9; i >= 0; i--) {
            if(numArr[i]!=0) {
                for (int j = 0; j < numArr[i]; j++) {
                    sum+=i;
                    strResult+=String.valueOf(i);
                }
            }
        }
        if (numArr[0]>0&&sum%3==0){
            System.out.println(strResult);
        }else {
            System.out.println("-1");
        }
    }
}