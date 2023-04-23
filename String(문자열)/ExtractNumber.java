import java.util.*;
public class ExtractNumber {
    public int solution(String s) {
        String answer = "";

        for(char x : s.toCharArray()) {
            if(Character.isDigit(x)) {
                answer += x;
            }
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        ExtractNumber extractNumber = new ExtractNumber();
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        System.out.println(extractNumber.solution(word));
    }
}
