package backjoon.done.year25.may;

import java.util.*;

public class No1181 {
    public static void main(String[] args) throws Exception {
        Set<String> set = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i  = 0; i < n; i++){
            set.add(sc.next());
        }

        // String[] arr = new String[set.size()];
        // String 배열보다는 List로 변환하는게 좋음

        List<String> list = new ArrayList<>(set);

        list.sort((s1, s2)->{
            if (s1.length()== s2.length()) return s1.compareTo(s2);
            return s1.length() - s2.length();
        });

        for (String s : list){
            System.out.println(s);
        }

    }
}
