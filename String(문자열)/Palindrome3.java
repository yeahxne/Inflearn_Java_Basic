import java.util.*;
public class Palindrome3 {
    public String solution(String s) {
        String answer = "NO";

        /* replaceAll() 함수는 대상 문자열을 원하는 문자 값으로 변환하는 함수입니다.
        *  첫번째 매개변수는 변환하고자 하는 대상이 될 문자열
        *  두번째 매개변수는 변환할 문자 값 */
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        /* String 에 StringBuilder 를 그대로 넣을 수는 없다. toString()을 붙여야한다. */
        String stringBuilder = new StringBuilder(s).reverse().toString();

        if(s.equals(stringBuilder)) {
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        Palindrome3 palindrome3 = new Palindrome3();
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        System.out.println(palindrome3.solution(word));
    }
}
