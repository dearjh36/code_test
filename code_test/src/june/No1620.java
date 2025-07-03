package june;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class No1620 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<Integer, String> stringMap = new HashMap<>(); // key : Integer, value : String
        Map<String, Integer> integerMap = new HashMap<>(); // key : String, value Integer

        for (int i = 1; i <= n; i++){
            String name = br.readLine();
            stringMap.put(i, name);
            integerMap.put(name, i);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++){
            String input = br.readLine();

            if (isInteger(input)){
                sb.append(stringMap.get(Integer.parseInt(input))).append('\n');
            }else {
                sb.append(integerMap.get(input)).append('\n');
            }
        }

        System.out.println(sb);


    }

    public  static boolean isInteger(String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

}
