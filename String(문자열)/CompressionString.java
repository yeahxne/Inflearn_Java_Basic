import java.util.*;
public class CompressionString {
    public String solution(String s) {
        String answer = "";
        s = s + " ";
        int cnt = 1;  /* 반복 횟수 */

        for(int i=0; i<s.length()-1; i++) {
            if(s.charAt(i) == s.charAt(i+1)) {
                cnt++;
            } else {
                answer += s.charAt(i);
                if(cnt > 1) {
                    answer += String.valueOf(cnt);
                }
                cnt = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        CompressionString compressionString = new CompressionString();
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        System.out.println(compressionString.solution(str));
    }
}
