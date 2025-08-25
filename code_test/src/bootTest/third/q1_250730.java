package bootTest.third;

public class q1_250730 {
    public static void main(String[] args) {
        String[] keyinput = {"left", "right", "up", "right", "right"};
        int[] board = {11, 11};

        int[] answer = new int[2];


        for (String key : keyinput) {
            switch (key) {
                case "right":
                    if (answer[0] + 1 <= board[0] / 2) {
                        answer[0]++;
                    }
                    break;

                case "left":
                    if (answer[0] - 1 >= -board[0] / 2) {
                        answer[0]--;
                    }
                    break;

                case "up":
                    if (answer[1] + 1 <= board[1] / 2) {
                        answer[1]++;
                    }
                    break;

                case "down":
                    if (answer[1] - 1 >= -board[1] / 2) {
                        answer[1]--;
                    }
                    break;
            }
        }

        System.out.println(answer[0]);
        System.out.println(answer[1]);

    }
}
/*
    class Solution{
        public int[] solution(String[] keyinput, int[] board){

            int[] answer = new int[2];

            for(int i = 0; i < keyinput.length; i++){
                switch(keyinput[i]){
                    case "rigth":
                        if (answer[0]++ > board[0]/2){
                            break;
                        }else {
                            answer[0]++;
                            break;
                        }

                    case "left":
                        if (answer[0]-- < board[0]/2){
                            break;
                        }else {
                            answer[0]--;
                            break;
                        }

                    case "up":
                        if (answer[1]++ > board[0]/2){
                            break;
                        }else {
                            answer[1]++;
                            break;
                        }
                    case "down":
                        if (answer[1]-- < board[0]/2){
                            break;
                        }else {
                            answer[1]--;
                            break;
                        }

                }
            }




            return answer;
        }
    }
}
*/

