package Hash;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public String solution(String str1, String str2) {
        String answer = "YES";

        HashMap<Character, Integer> map = new HashMap<>();

        for(char x : str1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        for(char x : str2.toCharArray()) {
            if(!map.containsKey(x) || map.get(x)==0) {  /* 값이 존재하면 -1을 해주고, 0이거나 문자가 없으면 NO를 리턴한다. */
                return "NO";
            }
            map.put(x, map.get(x)-1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        System.out.println(anagram.solution(str1, str2));
    }
}
