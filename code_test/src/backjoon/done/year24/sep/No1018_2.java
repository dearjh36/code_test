package backjoon.done.year24.sep;

import java.util.Scanner;

public class No1018_2 {

    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        arr = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = sc.next();

            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }

        int N_row = N -7;
        int M_col = M - 7;

        for (int i = 0; i<N_row; i++){

        }

    }

    public static void find(int x, int y) {
        int end_x = x + 8;
        int end_y = x + 8;
        int count = 0;

        boolean TF = arr[x][y];

        for (int i = 0; i < end_x; i++) {
            for (int j = 0; j < end_y; j++) {
                if (arr[x][y] != TF) {
                    count++;
                }
                TF = (!TF);
            }
            TF = (!TF);
        }

        count = Math.min(count, 64-count);

        min = Math.min(min, count);

    }
}
