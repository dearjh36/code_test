package backjoon.done.year24.aug;

import java.util.Scanner;

public class No19532 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        int y = (c*d - a*f) / (b*d - a*e);
        int x = (c*e- b*f) / (a*e - b*d);

        System.out.println(x +" "+ y);

    }
}
