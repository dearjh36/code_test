package bootTest.first;

import java.util.ArrayList;
import java.util.List;

public class q4_250508 {
    public int[] solution(int []arr) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);  // 첫 번째 값은 무조건 포함

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }

        answer = list.stream().mapToInt(Integer::intValue).toArray();

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
