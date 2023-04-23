import java.util.*;
public class FlipWord1 {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        /* String: 변경 불가능한 문자열 생성
        *  StringBuilder: 변경 가능한 문자열을 만들어 줌. */
        for(String x : str) {
            /* reverse() 메소드를 제공하는 StringBuilder/StringBuffer 클래스를 이용한다. */
            /* String 에 StringBuilder 를 그대로 넣을 순 없다. toString()을 붙여야 한다. */
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        FlipWord1 flipWord1 = new FlipWord1();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String[] words = new String[N];  /* String N개의 배열 */

        /* N개의 단어 입력 */
        for(int i=0; i<N; i++) {
            words[i] = scanner.next();
        }

        /* 단어 뒤집어서 출력력 */
       for(String x : flipWord1.solution(N, words)) {
            System.out.println(x);
        }
    }
}
