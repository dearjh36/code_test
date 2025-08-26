package bootTest.third;

public class q3_250730_wrong {
    public static void main(String[] args) {
        String s = "banana";

        char[] arr = s.toCharArray();
        int answer = 0;

        char ch = arr[0];

        int cnt = 0;
        int stepCnt = 0;

        for (int i = 0; i< arr.length; i++){
            if (ch != arr[i]){
                stepCnt++;
            }else {
                cnt++;
            }

            if (cnt == stepCnt){
                answer++;
                if (i + 1 < arr.length) {
                    ch = arr[i + 1];
                }
                cnt = 0;
                stepCnt = 0;
            }

            if (cnt != stepCnt) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
