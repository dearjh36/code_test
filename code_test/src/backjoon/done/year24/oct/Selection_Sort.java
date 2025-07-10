package backjoon.done.year24.oct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Selection_Sort {
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<>();

        for (int i = 1; i<=6 ;i++){
            nums.add(i);
        }

        Collections.shuffle(nums);

        
    }

    private static void selecton_sort(int[] a, int size){
        for(int i = 0; i < size; i++){
            int min_index = i;

            // 최솟값 인덱스 찾기
            for (int j = i + 1; j < size; j++){ // i +1 이후
                if (a[j] < a[min_index]){
                    min_index = j;
                }
            }

            swap(a, min_index, i);
        }
    }

    // 배열까지 받아야 바뀐게 배열에 적용
    // 따로 swap() 을 두는 이유는 코드 재사용성 증가, 가독성 향ㅅ아, 디버깅 편리 를 위해서다.
    private static  void  swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
