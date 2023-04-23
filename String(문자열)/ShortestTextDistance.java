import java.util.*;
public class ShortestTextDistance {
    public int[] solution(String s, char c) {
        int p = 1000;  /* 떨어진 거리 */
        int[] answer = new int[s.length()];  /* 문자열 길이만큼 int 배열 생성 */

        char[] cArray = s.toCharArray();
        for(int i=0; i<s.length(); i++) {
            if(cArray[i] == c) {
                p = 0;
            } else {
                p = p+1;
            }
            answer[i] = p;
        }

        p = 1000;  /* 다시 떨어진 거리 초기화 */
        for(int i=s.length()-1; i>=0; i--) {
            if(cArray[i] == c) {
                p = 0;
            } else {
                p = p+1;
                answer[i] = Math.min(answer[i], p);  /* if(p < answer[i]) answer[i] = p; */
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ShortestTextDistance shortestTextDistance = new ShortestTextDistance();
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        /* scanner.next()로 문자열을 입력받은 다음, String.charAt(0)으로 첫번째 문자를 꺼내오면 된다. */
        char c = scanner.next().charAt(0);
        for(int x : shortestTextDistance.solution(s,c)) {
            System.out.print(x + " ");
        }
    }
}
