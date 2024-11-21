package coding_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dohyun2491 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1] ;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int current = arr[0];
        int maxLen = 1, len = 1;
        Boolean ascend = null;
        for(int i=1; i<=n; i++){
            if(ascend == null){
                if (current < arr[i]) {
                    ascend = true;
                } else if (current > arr[i]) {
                    ascend = false;
                }
                if(i == n){
                    maxLen = n;
                }
            }else{
                if(ascend){
                    if(current>arr[i] || i == n){
                        len = 1;
                        for(int j=i-1; j>0; j--){
                            if(arr[j-1]>arr[j]){
                                maxLen = Math.max(maxLen,len);
                                ascend = false;
                                break;
                            }else if(j==1){
                                maxLen = Math.max(maxLen,len+1);
                                ascend = false;
                                break;
                            }
                            len++;
                        }
                    }
                }else{
                    if(current<arr[i] || i == n){
                        len = 1;
                        for(int j=i-1; j>0; j--){
                            if(arr[j-1]<arr[j]){
                                maxLen = Math.max(maxLen,len);
                                ascend = true;
                                break;
                            }else if(j==1){
                                maxLen = Math.max(maxLen,len+1);
                                ascend = true;
                                break;
                            }
                            len++;
                        }
                    }
                }
            }
            current = arr[i];
        }
        maxLen = Math.max(maxLen,len);
        if(maxLen<3){
            maxLen = 2;
        }
        if(n == 1){
            maxLen = 1;
        }
        System.out.println(maxLen);
    }
}