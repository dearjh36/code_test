package backjoon.done.year24;

import java.util.Scanner;

public class No24313 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();

        int fx = a1 * n0 + a0;
        int gx = n0 * c ;

        if (fx<=gx && a1<=c){
            System.out.println(1);
        }else {
            System.out.println(0);
        }

        /*
        * f(n) <= c * g(n)
        * a1 * n <= c * n
        * a1 * n + a0 <= c * n
        * a0 <= (c - a1) * n
        *
        *  n은 전제가 양수
        * c - a1 이 양수여야 한다
        * c - a1 >= 0
        * c >= a1
        * */

    }
}
