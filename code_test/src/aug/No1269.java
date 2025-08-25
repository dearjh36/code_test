package aug;

import java.util.*;

public class No1269 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i< A+B; i++){
            int n = sc.nextInt();

            if (map.get(n) == null){
                map.put(n, 1);
            }else {
                map.put(n, map.get(n)+1);
            }
        }

        int cnt = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
