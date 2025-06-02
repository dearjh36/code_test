package backjoon.done.aug;

import java.util.Scanner;

public class No2798 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        int max = 0;

        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 2; i++) {
            if (arr[i] >= m) {
                continue;
            }

            for (int j = i + 1; j < n - 1; j++) {
                if (arr[i] + arr[j] >= m) {
                    continue;
                }
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] > m) {
                        continue;
                    }

                    if (arr[i] + arr[j] + arr[k] > max) {
                        max = arr[i] + arr[j] + arr[k];
                    }

                }
            }
        }

        System.out.println(max);
    }
}
