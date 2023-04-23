import java.util.*;
public class Palindrome1 {
    public String solution(String str) {
        String answer;
        String lowerCaseStr = str.toLowerCase();  /* 대소문자 구분X */

        char[] c = lowerCaseStr.toCharArray();
        int lt = 0;
        int rt = str.length()-1;

        while(lt<rt) {
            char tmp = c[lt];
            c[lt] = c[rt];
            c[rt] = tmp;
            lt++;
            rt--;
        }

        answer = String.valueOf(c);
        if(lowerCaseStr.compareTo(answer) == 0) {  /* 같은 경우는 숫자나 문자나 0을 리턴 */
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Palindrome1 palindrome1 = new Palindrome1();
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        System.out.println(palindrome1.solution(word));
    }
}
