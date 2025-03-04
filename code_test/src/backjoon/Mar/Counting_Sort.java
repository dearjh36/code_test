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
        for (int i = 1; i < cnt.length; i++){
            // 누적 합 해주기
            cnt[i] += cnt[i-1];
        }

    }

}
