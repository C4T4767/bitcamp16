import java.io.*;
import java.util.Arrays;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int[] dwarf = new int[9];
        for(int i=0; i<9; i++){
            dwarf[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(dwarf);
        int[] dwarfOut = find100(dwarf);
        for (int i = 0; i < dwarf.length; i++) {
            if (i != dwarfOut[0] && i != dwarfOut[1]) {
                System.out.println(dwarf[i]);
            }
        }
    }

    static int[] find100(int[] dwarf){
        int[] dwarfOut = new int[2];

        loop :
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                int sum=0;
                for (int k = 0; k < dwarf.length; k++) {
                    if (k != i && k != j) {
                        sum += dwarf[k];
                    }
                }
                if(sum == 100){
                    dwarfOut[0] = i;
                    dwarfOut[1] = j;
                    break loop;
                }
            }
        }
        return dwarfOut;
    }
}