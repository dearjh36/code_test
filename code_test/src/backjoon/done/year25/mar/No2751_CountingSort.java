package backjoon.done.year25.mar;

import java.io.*;

public class No2751_CountingSort {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        /*
		  -1000000 ~ 1000000
		  기준점 0 = index 100000 으로 생각
		*/
        boolean[] arr = new boolean[2000001];

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++){
            arr[Integer.parseInt(br.readLine()) + 1000000] = true;
        }

        for (int i = 0 ; i<arr.length; i++){
            if (arr[i]){
                sb.append((i - 1000000)).append('\n');
            }
        }

        System.out.println(sb);

    }

}
