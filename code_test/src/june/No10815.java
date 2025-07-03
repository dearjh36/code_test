package june;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No10815 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] Narr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            Narr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(Narr);

        int m = Integer.parseInt(br.readLine());



        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            int temp = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(Narr, n, temp)).append(" ");
        }

        System.out.println(sb);



    }

    public static int binarySearch(int[] Narr, int N, int search) {
        int first = 0;
        int last = N - 1;
        int mid = 0;

        while (first <= last) {
            mid = (first + last) / 2; // 중간 인덱스

            if (Narr[mid] == search) {
                return 1;
            }

            if (Narr[mid] < search) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }

        return  0;

    }

}
