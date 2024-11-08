package backjoon.done;

import java.util.Arrays;
import java.util.Scanner;

public class No14215 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];

        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        Arrays.sort(arr);


        if (arr[0] + arr[1] <= arr[2]){
            int n = arr[2]-arr[0]-arr[1];

            if (n == 0){
                n =1;
            }

            arr[2] = arr[2] - n;

            if (arr[0] + arr[1] == arr[2]){
                arr[2]--;
            }
        }

        System.out.println(arr[2]+arr[0]+arr[1]);

    }
}
