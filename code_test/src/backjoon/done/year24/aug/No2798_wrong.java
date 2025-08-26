package backjoon.done.year24.aug;

import java.util.Arrays;
import java.util.Scanner;

public class No2798_wrong {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        int over = n;
        int sum = 0;
        int max = 0;

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i = 0; i<n; i++){
            if (arr[i] >= m -2){
                over = i;
                break;
            }
        }

        for (int i = over-1; i >= 2; i--){
            for (int j = i-1; j >=1; j--){
                if (arr[i] + arr[j] >= m-2){
                    continue;
                }
                for (int k = j-1; k>= 0; k--){
                    if(arr[i] + arr[j] + arr[k] > m){
                        continue;
                    }
                    sum = arr[i] + arr[j] + arr[k];

                    if(sum>max){
                        max = sum;
                    }

                }
            }
        }

        System.out.println(max);
    }
}
