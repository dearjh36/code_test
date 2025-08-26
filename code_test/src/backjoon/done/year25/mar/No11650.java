package backjoon.done.year25.mar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
* 이렇게 풀면 앞에 지나간 부분을 정렬을 하지 못 함
* 그럼 버블 정렬 같을 걸써서 x만 2번을 정렬하고
* y도 2번 정렬해야하는데 시간 초과 날듯...
* */

public class No11650 {
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

        for (int i = 1; i<n; i++){
            if (arr[i-1][0] > arr[i][0]){
                int x = arr[i-1][0];
                int y = arr[i-1][1];

                arr[i-1][0] = arr[i][0];
                arr[i-1][1] = arr[i][1];

                arr[i][0] = x;
                arr[i][1] = y;
            }
            else if (arr[i-1][0] == arr[i][0]){
                for (int j = 1 ; j < n; j++){
                    if (arr[i-1][1] > arr[i][1]){
                        int z = arr[i][1];

                        arr[i-1][1] = arr[i][1];
                        arr[i][1] = z;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++){
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append('\n');
        }

        System.out.println(sb);

    }
}
