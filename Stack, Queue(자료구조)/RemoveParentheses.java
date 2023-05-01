package StackAndQueue;

import java.util.*;

/* 괄호 관련 문제가 주어지면 stack 으로 풀기 */
public class RemoveParentheses {
    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()) {
            if(x == ')') {
                while(stack.pop() != '(');  /* '('를 만날 때까지 pop 한다. */
            } else {
                stack.push(x);
            }
        }

        for(int i=0; i<stack.size(); i++) {  /* stack.size(): stack 에 남아있는 원소의 크기 */
            answer += stack.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        RemoveParentheses removeParentheses = new RemoveParentheses();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        System.out.println(removeParentheses.solution(str));
    }
}
