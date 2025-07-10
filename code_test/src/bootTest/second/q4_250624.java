package bootTest.second;

public class q4_250624 {
    public static void main(String[] args){

        int[] answer = {};

        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        int cnt = 0;
        int zeroCnt = 0;

        for (int i = 0; i<lottos.length; i++){

            if (lottos[i] == 0){
                zeroCnt++;
                continue;

            }

            for (int j = 0; j<win_nums.length; j++){
                if (lottos[i] == win_nums[j]){
                    cnt++;
                    break;
                }
            }
        }

        System.out.println(cnt);

        int max = (cnt+zeroCnt >= 2) ? 7 - cnt - zeroCnt : 6;
        int min = (cnt >=2 ) ? 7 - cnt : 6;

        answer = new int[]{max, min};
    }
}
