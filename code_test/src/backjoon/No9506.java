package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 약수들의 합
// https://www.acmicpc.net/problem/9506

public class No9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {

            int n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }
            int sum = 0;

            List<Integer> arr = new ArrayList<>();

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    arr.add(i);
                    sum += i;
                }
            }

            sb.append(n);

            if (sum == n) {
                sb.append(" = ");
                for (int i = 0; i < arr.size() - 1; i++) {
                    sb.append(arr.get(i) + " + ");
                }
                sb.append(arr.get(arr.size() - 1));
            } else {
                sb.append(" is NOT perfect.");
            }

            sb.append("\n");

        }
        System.out.print(sb);
        br.close();
    }
}
