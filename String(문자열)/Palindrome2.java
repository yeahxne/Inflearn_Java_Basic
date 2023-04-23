import java.util.*;
public class Palindrome2 {
    public String solution(String str) {
        /* 방법1
        String answer = "YES";
        str = str.toLowerCase();

        int len = str.length();
        for(int i=0; i<len/2; i++) {
            if(str.charAt(i) != str.charAt((len-1)-i)) {
                return "NO";
            }
        } */

        /* 방법2 */
        String answer = "NO";
        String stringBuilder = new StringBuilder(str).reverse().toString();

        if(str.equalsIgnoreCase(stringBuilder)) {
            answer = "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        Palindrome2 palindrome2 = new Palindrome2();
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        System.out.println(palindrome2.solution(word));
    }
}
