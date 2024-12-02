package kr.co.bit;

import java.util.ArrayList;
import java.util.Scanner;

public class _2605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] student = new int[num+1];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);

        for(int i = 1; i <= num; i++) { //기존순서
            student[i] = i;
            list.add(i);
        }

        for(int i = 1; i <= num; i++) { //이동
            int movenum = sc.nextInt();
            int nownum = student[i];
            list.remove(i);
            list.add(i-movenum, nownum);
        }

        for(int i = 1; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}
