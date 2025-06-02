package backjoon.done;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No2750 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());

        int[] arr = new int[size];

        for (int i = 0; i<size;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int i : arr){
            System.out.println(i);
        }
    }
}
