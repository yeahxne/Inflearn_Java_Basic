import java.util.*;
public class FlipWord2 {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for(String x : str) {
            char[] s = x.toCharArray();
            int lt = 0;
            int rt = x.length()-1;

            while(lt<rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }


    public static void main(String[] args) {
        FlipWord2 flipWord2 = new FlipWord2();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String[] words = new String[N];  /* String N개의 배열 */

        /* N개의 단어 입력 */
        for(int i=0; i<N; i++) {
            words[i] = scanner.next();
        }

        /* 단어 뒤집어서 출력력 */
        for(String x : flipWord2.solution(N, words)) {
            System.out.println(x);
        }
    }
}
