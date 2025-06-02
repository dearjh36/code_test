package backjoon.mar;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No1427 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[10];

        /* 대체 가능
        for (char aChar : chars) {
            arr[aChar - '0']++;
        }
        */

        for (int i = 0; i < chars.length; i++){
            int num = chars[i] - '0';
            arr[num]++;
        }

        for (int i = 9; i >= 0; i--){
            while (arr[i] > 0){
                sb.append(i);
                arr[i]--;
            }
        }

        System.out.println(sb);
    }
}
