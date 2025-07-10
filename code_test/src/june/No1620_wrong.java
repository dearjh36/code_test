package june;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class No1620_wrong {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, String> map = new HashMap<>();

        for (int i = 1; i <= n; i++){
            map.put(Integer.toString(i), br.readLine());
        }

        String[] arr = new String[m];

        for (int i = 0; i<m; i++){

            arr[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();

        for(Map.Entry<String, String> entry : map.entrySet()){

        }
        for (int i = 0; i < m; i++){
            if (isInteger(arr[i])){
                sb.append(map.get(arr[i])).append("\n");
            }else {
                for(Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry.getValue().equals(arr[i])) {
                        sb.append(entry.getKey()).append("\n");
                    }
            }
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
