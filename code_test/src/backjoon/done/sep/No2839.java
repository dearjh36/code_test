package backjoon.done.sep;

import java.util.Arrays;
import java.util.Scanner;

public class No2839 {
    // 나중에 개선해보기
    // 근데 그냥 풀이가 틀린듯...
    // 아 이유 찾음 5를 빼지말고 3을 뺏어야하네
    //
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0;

        if (N == 3){
            cnt = 1;
        }

        if (N/5 == 0){
            cnt += N/5;
        } else if ((N%5)%3 == 0) {
            cnt += N/5;
            cnt += (N%5)/3;
        }else {
            int[] arr = new int[N];
            int num = 0;
            while (N>5){
                N = N-5;
                    cnt++;
                if (N%3 == 0){
                    arr[num] = cnt + N/3;
                    num++;
                }
            }

            cnt = 0;

            int[] result = Arrays.stream(arr)
                    .filter(value -> value != 0)
                    .toArray();

            if (result.length != 0) {
                cnt = result[0];
            }

        }

        if (cnt == 0){
            if (N%3 == 0){
                cnt += N/3;
            }else {
                cnt = -1;
            }
        }

        System.out.println(cnt);

    }
}
