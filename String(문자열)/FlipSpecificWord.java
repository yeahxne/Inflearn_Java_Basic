import java.util.*;
public class FlipSpecificWord {
    public String solution(String s) {
        String answer;
        char[] c = s.toCharArray();  /* String 을 기반으로 한 문자 배열이 생성 */
        int lt = 0;
        int rt = s.length()-1;

        while(lt<rt) {
            if(!Character.isAlphabetic(c[lt])) {
                lt++;
            }
            else if(!Character.isAlphabetic(c[rt])) {
                rt--;
            }
            else {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(c);  /* String 클래스의 valueOf() 메소드: () 안의 객체를 String 객체로 변환 */
        return answer;
    }

    public static void main(String[] args) {
        FlipSpecificWord flipSpecificWord = new FlipSpecificWord();
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        System.out.println(flipSpecificWord.solution(word));
    }
}
