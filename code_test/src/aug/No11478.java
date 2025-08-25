package aug;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class No11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        Set<String> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++){
            String name ="";
            for (int j = i; j < str.length(); j++){
                name += str.substring(j, j+1);
                set.add(name);
            }
        }

        System.out.println(set.size());
    }
}
