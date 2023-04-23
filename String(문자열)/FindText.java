import java.util.Scanner;

public class FindText {
    public int solution(String s, char c) {
        /* 특정문자가 입력받은 문자열에 몇 개 존재하는지 */
        int answer = 0;

        /* 대소문자 구분하지 않음. */
        s = s.toUpperCase();
        c = Character.toUpperCase(c);  //Character 클래스의 toUpperCase 에 변환할 문자를 파라미터로 넣어 선언함.

        /* 방법1. for 문 */
        /*for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == c) {
                answer++;
            }
        }*/

        /* 방법2. for each 문 */
        for (char x : s.toCharArray()) {  //String 을 char 형 배열로 바꿈.
            if (x == c) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        FindText findText = new FindText();
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        char c = scanner.next().charAt(0);

        System.out.print(findText.solution(s,c));
    }
}
