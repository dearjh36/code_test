package bootTest.third;

import java.util.Arrays;

public class q2_250730 {
    public static void main(String[] args){
        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

        int answer = 0;

        Arrays.sort(score);

        int n = score.length/m;

        for (int i = score.length ; i >= 0; i -= m){
            if (i-m < 0){
                break;
            }
            answer += score[i-m] * m;
        }

        System.out.println(answer);

    }



}
