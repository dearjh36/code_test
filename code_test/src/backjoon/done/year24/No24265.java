package backjoon.done.year24;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class No24265 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println( a*(a-1) /2);
        System.out.print(2);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        long n = Long.parseLong(br.readLine());

        System.out.println((n * (n - 1)) / 2);
        System.out.println(2);
    }
}
