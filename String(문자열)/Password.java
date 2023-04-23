import java.util.*;
public class Password {
    public String solution(int n, String s) {
        String answer = "";

        for(int i=0; i<n; i++) {
            String tmp = s.substring(0,7).replace('#','1').replace('*','0');
            s = s.substring(7);

            /* 숫자형의 문자열을 인자 값으로 받으면 해당 값을 10진수의 Integer 형으로 반환해준다. */
            int num = Integer.parseInt(tmp, 2);
            /* int 타입을 char 타입으로 강제 형변환 -- 유니코드로 변환 */
            answer += (char)num;
        }

        return answer;
    }

    public static void main(String[] args) {
        Password password = new Password();
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        String str = scanner.next();

        System.out.println(password.solution(num, str));
    }
}
