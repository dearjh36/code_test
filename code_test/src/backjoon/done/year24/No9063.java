package backjoon.done.year24;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class No9063 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int[] x = new int[a];
        int[] y = new int[a];

        for (int i = 0; i<a; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int xMax = Arrays.stream(x).max().getAsInt();
        int xMin = Arrays.stream(x).min().getAsInt();

        int yMax = Arrays.stream(y).max().getAsInt();
        int yMin = Arrays.stream(y).min().getAsInt();

        int area = (xMax-xMin) * (yMax-yMin);

        if (a <= 1 ){
            System.out.println(0);
        }else {
            System.out.println(area);
        }
    }
}
