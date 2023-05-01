package StackAndQueue;

import java.util.*;

public class IronRod {
    public int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '(') {  /* '('일 경우, stack 에 push */
                stack.push(str.charAt(i));
            } else {  /* ')'일 경우 */
                stack.pop();
                if(str.charAt(i-1) == '(') {  /* str 의 이전 값이 '('인 경우, 레이저 */
                    answer += stack.size();
                } else if(str.charAt(i-1) == ')') {  /* str 의 이전 값이 ')'인 경우, 막대기의 끝 */
                    answer += 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        IronRod ironRod = new IronRod();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        System.out.println(ironRod.solution(str));
    }
}
