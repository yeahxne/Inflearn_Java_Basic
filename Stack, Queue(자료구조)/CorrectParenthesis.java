package StackAndQueue;

import java.util.*;

public class CorrectParenthesis {
    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else {  /* ')'괄호를 만난 상황 */
                if(stack.isEmpty()) {  /* ')'에 대한 짝이 존재하지 않는 상황 */
                    return "NO";
                }
                stack.pop();
            }
        }

        if(!stack.isEmpty()) {  /* '('가 ')'보다 더 많은 상황 */
            return "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        CorrectParenthesis correctParenthesis = new CorrectParenthesis();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        System.out.println(correctParenthesis.solution(str));
    }
}
