package backjoon.done.year25.mar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// gpt의 힘을 빌려 풀어봄

public class No11650_solve {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];

        for (int i = 0 ; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[i][0] = x;
            arr[i][1] = y;
        }

        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n - 1 -1; j++){
                if (arr[j][0] > arr[j+1][0] || arr[j][0] == arr[j+1][0] && arr[j][1] > arr[j+1][1]){
                    int tempX;
                }
            }
        }

        for (int i = 0; i < n; i++){
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append('\n');
        }

        System.out.println(sb);

    }
}
