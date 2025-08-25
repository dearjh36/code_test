package july;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No10816_arr {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] Narr = new int[N];

        for (int i = 0; i < N; i++){
            Narr[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[M];
        int[] Marr = new int[M];

        for (int i = 0; i < M; i++){
           Marr[i] = Integer.parseInt(st.nextToken());
        }

        int n = 0;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (Marr[i] == Narr[j]) {
                    arr[i]++;
                }
            }
        }


    }

}
