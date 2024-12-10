package coding_test.dec_1st;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dohyun15649 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] in = br.readLine().split(" ");
        byte n = Byte.parseByte(in[0]), m = Byte.parseByte(in[1]);
        byte[] beforeArr = new byte[n+1];
        byte[] afterArr = new byte[1];
        for(byte i=1; i<=n; i++){
            beforeArr[i] = i;
        }
        sequence(beforeArr,afterArr,m);
        System.out.println(sb);
    }

    static void sequence(byte[] beforeArr, byte[] afterArr, byte m){
        if(afterArr.length-1 == m){
            for(byte i=1; i<afterArr.length; i++){
                sb.append(afterArr[i]).append(" ");
            }
            sb.append("\n");
        }else{
            for(byte i=1; i<beforeArr.length; i++){
                byte[] beforeArr2 = new byte[beforeArr.length-1];
                byte[] afterArr2 = new byte[afterArr.length+1];
                byte count = 1;
                for(byte j=1; j<beforeArr.length; j++){
                    if(i != j) {
                        beforeArr2[count] = beforeArr[j];
                        count++;
                    }
                }
                for(byte j=1; j<afterArr.length; j++){
                    afterArr2[j] = afterArr[j];
                }
                afterArr2[afterArr.length] = beforeArr[i];
                sequence(beforeArr2, afterArr2, m);
            }
        }
    }
}