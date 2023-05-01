package StackAndQueue;

import java.util.*;

public class Postfix {
    public int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(char x : str.toCharArray()) {
            if(Character.isDigit(x)) {  /* 숫자일 경우, stack 에 push */
                stack.push(x-48);  /* 문자'0'은 ASCII 코드로 48임 */
                /* stack.push(x-'0'); 과 동일 */
            } else {  /* 연산자일 경우, 계산 결과 값을 stack 에 push */
                int rt = stack.pop();  /* stack 에 있는 두 개의 숫자를 pop 하고 저장하고 계산 */
                int lt = stack.pop();
                if(x == '+') {
                    stack.push(lt+rt);
                } else if(x == '-') {
                    stack.push(lt-rt);
                } else if(x == '*') {
                    stack.push(lt*rt);
                } else if(x == '/') {
                    stack.push(lt/rt);
                }
            }
        }

        answer = stack.get(0);
        return answer;
    }

    public static void main(String[] args) {
        Postfix postfix = new Postfix();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        System.out.println(postfix.solution(str));
    }
}
