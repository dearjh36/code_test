package july;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class No10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++){
            int temp = Integer.parseInt(st.nextToken());

            if (map.get(temp) == null){
                map.put(temp,1);
            }else {
                map.put(temp, map.get(temp)+1);
            }

        }

        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[m];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++){
            int temp = Integer.parseInt(st.nextToken());

            if (map.get(temp) == null){
                arr[i] = 0;
            }else {
                arr[i] = map.get(temp);
            }
        }

        for (int i : arr){
            System.out.print(i + " ");
        }


    }

}
