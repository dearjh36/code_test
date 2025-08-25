package july;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class No10816_timeout {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++){
            map.put(i, Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[m];

        for (int i = 0; i < m; i++){
            int input = Integer.parseInt(st.nextToken());

            for (int j = 0; j < n; j++){
                if (map.get(j) == input){
                    arr[i]++;
                }
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

}
