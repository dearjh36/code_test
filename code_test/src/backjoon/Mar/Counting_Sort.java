package backjoon.Mar;

public class Counting_Sort {

    public static void main(String[] args){

        int[] arr = new int[100];        // 수열의 원소 : 100개
        int[] cnt = new int[30];        // 수의 범위 : 0 ~ 30
        int[] result = new int[100];    // 정렬될 배열


        // 배열 랜덤으로 할당
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*31); // 0 ~ 30
        }

        // Counting Sort
        // 과정 1
        for (int i = 0; i < arr.length; i++){
            // arr 의 value 값을 index로 하는 cnt 배열 값 1 증가
            // value 가 1 이면 cnt[1] 이 1++
            cnt[arr[i]]++;
        }

        // 과정 2
        for(int i = 1; i < cnt.length; i++) {
            // 누적 합 해주기
            cnt[i] += cnt[i - 1];
        }

        // 과정 3
        for(int i = arr.length - 1; i >= 0; i--) {
            /*
             *  i 번쨰 원소를 인덱스로 하는 counting 배열을 1 감소시킨 뒤
             *  counting 배열의 값을 인덱스로 하여 result에 value 값을 저장한다.
             */
            int value = arr[i];
            cnt[value]--;
            result[cnt[value]] = value;
        }

    }

}
