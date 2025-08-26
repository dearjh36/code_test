package bootTest.third;

import java.util.Stack;

public class q4_250730 {
    public static void main(String[] args) {
        String s = "[](){}";
        int answer = -1;

        char[] arr = s.toCharArray();

        for (int r = 0; r < arr.length; r++){

            Stack<Character> stack = new Stack<>();
            boolean isValid = true;

            for (char c : arr) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    char top = stack.pop();
                    if ((c == ')' && top != '(') ||
                            (c == '}' && top != '{') ||
                            (c == ']' && top != '[')) {
                        isValid = false;
                        break;
                    }
                }
            }

            if (isValid && stack.isEmpty()) {
                answer++;
            }
        }

        char first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;

        System.out.println(answer);
    }
}
