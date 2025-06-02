package backjoon.may;

import java.util.Arrays;
import java.util.Scanner;

// 그냥 String 배열 쓰려고 했는데 
// 중복있으면 배열에 null 이 생김 
// null 있으면 Arrays.sort() 가 작동안함
public class No1181_wrong {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        int cnt = 0;

        for (int i  = 0; i < n; i++){
            String str = sc.next();
            if (!Arrays.asList(arr).contains(str)){
                arr[i] = str;
                cnt++;
            }
        }

        Arrays.sort(arr, (s1, s2)->{
            if (s1.length() == s2.length()) return s1.compareTo(s2);
            return s1.length() - s2.length();
        });


    }
}
