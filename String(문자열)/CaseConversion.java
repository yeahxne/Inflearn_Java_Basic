import java.util.*;

public class CaseConversion {
    public String solution(String str) {
        String answer = "";

        /* 방법1. isLowerCase(), isUpperCase() 사용 */
        /*for(char x : str.toCharArray()) {
            if(Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
        }*/

        /* 방법2. 아스키 코드로 대소문자 비교 */
        for(char x : str.toCharArray()) {
            //소문자의 경우, 97~122
            if(x>=97 && x<=122){
                answer += (char)(x-32);  //char type + int type → 유니코드 반환
            }
            //대문자의 경우, 65~90
            else {
                answer += (char)(x+32);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        CaseConversion caseConversion = new CaseConversion();

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();  //문자열은 영어 알파벳으로만 구성되어 있음.

        System.out.println(caseConversion.solution(str));
    }
}
