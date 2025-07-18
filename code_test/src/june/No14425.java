package june;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class No14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int cnt = 0;

        Set<String> NSet = new HashSet<>();

        for (int i = 0; i < N; i++){
            NSet.add(br.readLine());
        }

        for (int i = 0; i < M; i++){
            String temp = br.readLine();

            if (NSet.contains(temp)){
                cnt++;
            }
        }

        System.out.println(cnt);

    }


}
