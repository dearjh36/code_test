package backjoon.may;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class No10814_StringBuilder {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 입력되는 나이의 범위 : 1 ~ 200
        StringBuilder[] sb = new StringBuilder[201];

        // 배열 sb의 인덱스에 각 StringBuilder 객체를 생성한다.
        for (int i = 0; i < sb.length; i++){
            sb[i] = new StringBuilder();
        }

        for(int i = 0; i < n; i++){
            int age = sc.nextInt();
            String name = sc.next();

            // 카운팅 정렬 : 나이를 index로 하여 해당 배열에 나이와 이름을 append() 한다.
            sb[age].append(age).append(' ').append(name).append('\n');
        }

        StringBuilder str = new StringBuilder();
        for (StringBuilder val : sb){
            str.append(val);
        }

        System.out.println(str);


    }

}
