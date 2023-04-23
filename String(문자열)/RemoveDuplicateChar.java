import java.util.*;
public class RemoveDuplicateChar {
    public String solution(String s) {
        String answer = "";

        /* charAt(): string 타입으로 받은 문자열을 char 타입으로 한글자만 받는 함수 */
        /* indexOf(): 문자열의 처음 위치에서 특정 문자열의 위치를 찾는 함수 */
        for(int i=0; i<s.length(); i++) {
//            System.out.println(s.charAt(i)+" "+i+" "+s.indexOf(s.charAt(i)));

            if(i == s.indexOf(s.charAt(i))) {
                answer += s.charAt(i);  /* '+'연산자를 사용하여 문자열에 문자 추가 */
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        RemoveDuplicateChar removeDuplicateChar = new RemoveDuplicateChar();
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        System.out.println(removeDuplicateChar.solution(word));
    }
}
