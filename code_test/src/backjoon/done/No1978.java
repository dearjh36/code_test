package backjoon.done;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 소수 찾기
// 1978
public class No1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            int sum = 0;

            for (int j = 1; j <= num; j++){
                if (num % j == 0) {
                    sum += j;
                }
            }

            if (sum == (num+1)){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
