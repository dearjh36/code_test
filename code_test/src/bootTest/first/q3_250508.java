package bootTest.first;

import java.util.Arrays;

public class q3_250508 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++){
            for (int j = array[commands[i][0]]; j < array[commands[i][1]]; j++){
                if(commands[i][1] - commands[i][0] == 0){
                    answer[i] = array[commands[i][2]];
                }else {
                    int[] arr = new int[commands[i][1] - commands[i][0]];

                    for (int k = 0; k < arr.length; k++){
                        arr[k] = array[j];
                    }

                    for (int k = 0; k < arr.length-1; k++){
                        int min = k;
                        for (int l = k+1; l < arr.length -1; l++){
                            if (arr[l] < arr[min]){
                                min = l;
                            }
                        }

                        int temp = arr[k];
                        arr[k] = arr[min];
                        arr[min] = temp;
                    }

                    answer[i] = arr[commands[i][2]];
                }
            }
        }

        return answer;
    }
}
