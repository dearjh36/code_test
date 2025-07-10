package backjoon.done.year25.may;

import java.util.Scanner;

public class No11650_wrong {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[][] arr = new int[size][2];

        for (int i = 0; i < size; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        for (int i = 0; i < size - 1; i++){
            int min_index = i;
            for (int j = i + 1; j < size; j++ ){
                if (arr[j][0] < arr[min_index][0]){
                    min_index = j;
                }
            }

            swap0(i, min_index, arr);
        }

        for (int i = 0; i < size - 1; i++){
            int min_index = i;
            for (int j = i + 1; j < size; j++ ){
                if (arr[j][1] < arr[min_index][1]){
                    min_index = j;
                }
            }

            swap1(i, min_index, arr);
        }

        for (int i = 0; i < size; i++){
            System.out.print(arr[i][0] + " ");
            System.out.println(arr[i][1]);

        }
    }

    static void swap0(int i, int j, int[][] arr){
        int temp = arr[i][0];
        arr[i][0] = arr[j][0];
        arr[j][0] = arr[temp][0];
    }

    static void swap1(int i, int j, int[][] arr){
        int temp = arr[i][1];
        arr[i][1] = arr[j][1];
        arr[j][1] = temp;
    }
}
