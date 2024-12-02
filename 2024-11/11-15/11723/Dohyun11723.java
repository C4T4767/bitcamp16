package coding_test;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Dohyun11723 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        StringBuilder output = new StringBuilder();
        String[] input;
        for(int i=0; i<n;i++){
            input = br.readLine().split(" ");
            switch (input[0]){
                case "add":
                    add(set, Integer.parseInt(input[1]));
                    break;
                case "remove":
                    remove(set, Integer.parseInt(input[1]));
                    break;
                case "check":
                    check(set, Integer.parseInt(input[1]),output);
                    break;
                case "toggle":
                    toggle(set, Integer.parseInt(input[1]));
                    break;
                case "all":
                    all(set);
                    break;
                case "empty":
                    empty(set);
                    break;
            }
        }

        bw.write(output.toString());
        bw.flush();
    }

    static void add(Set<Integer> set, Integer x){
        set.add(x);
    }
    static void remove(Set<Integer> set, Integer x){
        set.remove(x);
    }
    static void check(Set<Integer> set, Integer x, StringBuilder output) {
        if (set.contains(x)) {
            output.append("1\n");
        } else {
            output.append("0\n");
        }
    }
    static void toggle(Set<Integer> set, Integer x){
        if(set.contains(x)){
            set.remove(x);
        }else{
            set.add(x);
        }
    }
    static void all(Set<Integer> set){
        set.clear();
        for(int i=1;i<=20;i++){
            set.add(i);
        }
    }
    static void empty(Set<Integer> set){
        set.clear();
    }
}
