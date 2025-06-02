package backjoon.mar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class No2751 {

    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        // StringBuilder 사용하는 이유 : sout 사용하니 시간 초과 발생
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        for(int i : list){
            sb.append(i).append('\n');
        }

        System.out.println(sb);
    }

}
