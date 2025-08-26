package backjoon.done.year25.may;

import java.util.Arrays;
import java.util.Scanner;

public class No11650 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[][] arr = new int[size][2];

        for (int i = 0; i < size; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, (a, b) -> {
            if(a[0] == b[0]) return a[1] - b[1];
            return a[0] - b[0];
        });



        for (int i = 0; i < size; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
