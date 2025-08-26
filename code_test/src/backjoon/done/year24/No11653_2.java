package backjoon.done.year24;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class No11653_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            return;
        }

        for (int i = 2; i <= N; i++) {
            while (N % i == 0) {
                System.out.println(i);
                N = N / i;
            }
        }


    }
}
