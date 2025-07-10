package backjoon.done.year25.may;

import java.util.Scanner;

public class No10814_StringBuilder {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 입력되는 나이의 범위 1 ~ 200
        StringBuilder[] sb = new StringBuilder[201];

        // 객채배열(StringBuilder 타입의 배열 sb)의 인덱스에 각 StringBuilder 객체를 생성한다.
        for (int i = 0; i < sb.length; i++){
            sb[i] = new StringBuilder();
        }

        for (int i = 0; i < n; i++){
            int age = sc.nextInt();
            String name = sc.next();

            sb[age].append(age).append(' ').append(name).append('\n');
        }

        StringBuilder print = new StringBuilder();
        for (StringBuilder val : sb){
            print.append(val);
        }


    }

}
