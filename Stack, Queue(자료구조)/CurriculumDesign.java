package StackAndQueue;

import java.util.*;

public class CurriculumDesign {
    public String solution(String str1, String str2) {
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();

        for(char c : str1.toCharArray()) {  /* queue 에 필수값 추가 */
            queue.offer(c);
        }

        for(char c : str2.toCharArray()) {
            if(queue.contains(c)) {
                if(c != queue.poll()) {
                    return "NO";
                }
            }
        }

        if(!queue.isEmpty()) {
            return "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        CurriculumDesign curriculumDesign = new CurriculumDesign();
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.next();
        String str2 = scanner.next();

        System.out.println(curriculumDesign.solution(str1, str2));
    }
}
