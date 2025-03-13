package backjoon.Mar;

public class Counting_Sort {

    public static void main(String[] args){

        int[] arr = new int[100];        // 수열의 원소 : 100개
        int[] cnt = new int[31];        // 수의 범위 : 0 ~ 30
        int[] result = new int[100];    // 정렬될 배열


        // 배열 랜덤으로 할당
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*31); // 0 ~ 30
        }

        // Counting Sort
        // 과정 1
        for (int i = 0; i < arr.length; i++){
            cnt[arr[i]] ++;
        }

        // 과정 2
        for (int i = 1; i < cnt.length ; i++){
            cnt[i] += cnt[i-1];
        }

        // 과정 3
        //
        for (int i = arr.length - 1; i >=0; i--){

            int value = arr[i];
            cnt[value]--;
            result[cnt[value]] = value;

            // 한 줄로 만들면 이렇긴한데 보기 좋진 않은듯..
            // result[--cnt[arr[i]]] = arr[i];

        }

        for (int i:result){
            System.out.print(result[i] + " ");
        }

    }

}
