package bootTest.second;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class q2_250624 {
    public static void main(String[] args){

        int[] answer = {};

        int[] arr = {5, 9, 7, 10};
        List<Integer> list = new ArrayList<>();
        int divisor = 5;
        int index = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i]%divisor == 0){
                list.add(arr[i]);
                index++;
            }
        }



        if (index == 0){
            answer = new int[]{-1};
        } else {
            Collections.sort(list);
            answer = list.stream().mapToInt(Integer::intValue).toArray();
        }


    }
}
