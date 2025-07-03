package backjoon.done.year24.aug;

import java.util.Scanner;

public class No1436 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int count = 1;
        int num = 666;

        while (count != N){
            num++;

            if (String.valueOf(num).contains("666")){
                count++;
            }
        }

        System.out.println(num);
    }

}
