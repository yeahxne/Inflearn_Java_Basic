import java.util.Scanner;
public class WordsInSentence {
    public String solution(String str) {
        String answer = "";

        /* 방법1. split() 사용 */
        /*int m = Integer.MIN_VALUE;  //MIN_VALUE 를 붙여주면 실제 그 데이터 타입이 표현할 수 있는 숫자의 범위 중 가장 작은 숫자가 할당됨.

        String[] s = str.split(" ");

        for(String x : s) {
            if(m < x.length()) {
                m = x.length();
                answer = x;
            };
        }*/

        /* 방법2. indexOf, substring 사용 */
        int m = Integer.MIN_VALUE;
        int pos;

        while((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);
            if(m < tmp.length()) {
                m = tmp.length();
                answer = tmp;
            }
            str = str.substring(pos+1);
        }

        if(str.length() > m) {
            answer = str;
        }
        return answer;
    }

    public static void main(String[] args) {
        WordsInSentence wordsInSentence = new WordsInSentence();

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(wordsInSentence.solution(str));
    }
}
