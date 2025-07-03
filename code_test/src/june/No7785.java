package june;

import java.util.*;

public class No7785 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Map<String, String > map = new HashMap<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            map.put(sc.next(), sc.next());
        }

        List<String> list = new ArrayList<>();

        for (Map.Entry<String, String> entry : map.entrySet()){

            if (entry.getValue().equals("enter")){
                list.add(entry.getKey());
            }
        }

        list.sort(Comparator.reverseOrder());

        for (String s : list){
            System.out.println(s);
        }
    }
}
