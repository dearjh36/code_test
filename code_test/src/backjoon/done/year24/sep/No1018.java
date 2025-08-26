package backjoon.done.year24.sep;

import java.util.Scanner;

public class No1018 {

    public static boolean[][] arr;
    public static int min =64;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        arr = new boolean[N][M];

        for (int i = 0; i < N; i++){
            String str = sc.next();

            for (int j = 0; j < M; j++){
                if(str.charAt(j) == 'W'){
                    arr[i][j] = true;
                }else {
                    arr[i][j] = false;
                }
            }
        }

        int N_row = N - 7;
        int M_col = M - 7;

        for (int i = 0; i < N_row; i++){
            for (int j = 0; j<M_col; j++){
                find(i,j);
            }
        }

        System.out.println(min);
    }

    public static void find(int x , int y){
        int end_x = x + 8;
        int end_y = y + 8;
        int cnt = 0;

        boolean TF = arr[x][y];

        for (int i = x; i < end_x; i++){
            for (int j = y; j < end_y; j ++){
                // 색이 다를 경우 cnt 1 증가
                if (arr[i][j] != TF){
                    cnt++;
                }

                TF = (!TF);
            }
            TF = !TF;
        }

        // 첫번째 흑, 백 일 경우 둘 다 봐야함
        // 둘 중 작은거 고르기
        // 최대의 경우의 수는 8 * 8 을 넘지 않음
        cnt = Math.min(cnt, 64-cnt);

        min = Math.min(cnt, min);
    }
}
