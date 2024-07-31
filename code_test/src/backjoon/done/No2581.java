package backjoon.done;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] arr = new int[M];
        int num = 0;
        int result = 0;

        for (int i = N; i <= M; i++) {
            int sum = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j== 0) {
                    sum += j;
                }
            }

            if (sum == (i + 1)) {
                arr[num] = i;
                result += i;
                num++;
            }
        }

        if(result != 0) {
            System.out.println(result);
            System.out.println(arr[0]);
        } else {
            System.out.println(-1);
        }
    }
}
