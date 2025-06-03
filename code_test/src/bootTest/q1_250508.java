package bootTest;

public class q1_250508 {


    class Solution {
        public int solution(int[] num_list) {
            int answer = 0;

            if (num_list.length > 10){
                for(int i = 0; i < num_list.length; i++){
                    answer += num_list[i];
                }
            } else{
                for(int i = 0; i < num_list.length; i++){
                    if(answer == 0 ){
                        answer++;
                    }

                    answer = answer * num_list[i];
                }
            }

            return answer;
        }
    }
}
