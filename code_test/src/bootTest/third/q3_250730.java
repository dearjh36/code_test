package bootTest.third;

public class q3_250730 {
    public static void main(String[] args) {
        String s = "banana";

        char[] arr = s.toCharArray();

        int answer = 0;

        char ch = arr[0];
        int cnt = 0;
        int stepCnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (ch == arr[i]) {
                cnt++;
            } else {
                stepCnt++;
            }

            if (cnt == stepCnt) {
                answer++;
                // 다음 그룹 시작
                if (i + 1 < arr.length) {
                    ch = arr[i + 1];
                }
                cnt = 0;
                stepCnt = 0;
            }

        }

        if (cnt != stepCnt) {
            answer++;
        }

        System.out.println(answer);
    }
}
