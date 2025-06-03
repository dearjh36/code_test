package backjoon.done;

import java.util.Arrays;
import java.util.Scanner;

public class No5073 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];

        StringBuilder sb = new StringBuilder();

        while (true) {
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();
            Arrays.sort(arr);

            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
                break;
            }

            if (arr[0] + arr[1] > arr[2]) {
                if (arr[0] == arr[1] && arr[1] == arr[2]) {
                    sb.append("Equilateral \n");
                } else if (arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) {
                    sb.append("Isosceles \n");
                } else {
                    sb.append("Scalene \n");
                }
            } else {
                sb.append("Invalid \n");
            }
        }

        System.out.println(sb);

    }

}
