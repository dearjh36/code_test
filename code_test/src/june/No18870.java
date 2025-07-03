package june;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class No18870 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] sorted = new int[n];
        HashMap<Integer, Integer> rankingMap = new HashMap<>();

        for (int i = 0; i<n; i++){
            arr[i] = sorted[i] = sc.nextInt();
        }

        Arrays.sort(sorted);

        int rank = 0;
        for (int v : sorted){
            if (!rankingMap.containsKey(v)){
                rankingMap.put(v, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int key:arr){
            sb.append(rankingMap.get(key)).append(' ');
        }

        System.out.println(sb);
    }
}
