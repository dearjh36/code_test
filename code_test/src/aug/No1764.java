package aug;

import javax.swing.*;
import java.util.*;

public class No1764 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N+M; i++){
            String temp = sc.next();
            if (map.get(temp) == null){
                map.put(temp, 1);
            }else {
                map.put(temp, map.get(temp) + 1);
            }
        }



        List<String> list = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (entry.getValue() == 2){
                list.add(entry.getKey());
            }
        }

        Collections.sort(list);
        System.out.println(list.size());

        for (String s : list){
            System.out.println(s);
        }
    }
}
