package backjoon.sep;

import java.util.Scanner;

public class No2839_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0;

        while (N>=0){
            if (N%5 == 0 ){
                cnt += N/5;
                System.out.println(cnt);
                return;
            }

            N -= 3;
            cnt ++;
        }

        System.out.println(-1);

    }
}