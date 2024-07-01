package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class No2587 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        int max = 0;

        for (int i = 0; i<5; i++){
            arr[i] = sc.nextInt();
            max += arr[i];
        }

        Arrays.sort(arr);
        

        System.out.println(max/5);
        System.out.println(arr[2]);

        sc.close();

    }
}
