package june;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10815_TimeOut {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] Narr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < Narr.length; i++){
            Narr[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] Marr = new int[m];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < Marr.length; i++){
            Marr[i] = Integer.parseInt(st.nextToken());
        }

        int[] result = new int[m];

        for (int i = 0; i < Marr.length; i++){
            for (int j = 0; j < Narr.length; j++){
                if (Marr[i] == Narr[j]) {  // 비교 수정
                    result[i] = 1;
                    break;
                }
            }
        }

        for (int i : result)
            System.out.print(i + " ");

    }
}
