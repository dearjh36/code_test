package backjoon;

import java.util.Scanner;

// 약수들의 합
// https://www.acmicpc.net/problem/9506
// 완전수는 자기 자신을 제외한 가장 큰 약수는 자기 자신의 절반 이하이다.
public class No9506_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        while (n != -1) {
            n = scan.nextInt();
            int sum = 0;
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    sum += i;
                }
                if (sum == n) {
                    System.out.print(n + " = ");
                    for (int j = 1; j <= n / 2; j++) {
                        if (j == n / 2) {
                            System.out.print(j);
                        } else if (n % j == 0) {
                            System.out.print(j + " + ");
                        }

                    }
                } else if (sum > n) {
                    System.out.print(n + " is NOT perfect.");
                }
            }
            System.out.println();
        }
    }
}
