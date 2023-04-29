package Hash;

import java.util.HashMap;
import java.util.Scanner;

public class FindAllAnagram {
    public int solution(String S, String T) {
        int answer = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i=0; i<T.length()-1; i++) {  /* map1 : S에 대한 HashMap */
            map1.put(S.charAt(i), map1.getOrDefault(S.charAt(i),0)+1);
        }
        for(char x : T.toCharArray()) {  /* map2: T에 대한 HashMap */
            map2.put(x, map2.getOrDefault(x,0)+1);
        }

        int lt = 0;
        for(int rt=T.length()-1; rt<S.length(); rt++) {
            map1.put(S.charAt(rt), map1.getOrDefault(S.charAt(rt),0)+1);
            if(map1.equals(map2)) {  /* map1과 map2가 일치하는지 비교 */
                answer++;
            }
            map1.put(S.charAt(lt), map1.get(S.charAt(lt))-1);
            if(map1.get(S.charAt(lt))==0) {
                map1.remove(S.charAt(lt));
            }
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        FindAllAnagram findAllAnagram = new FindAllAnagram();
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();
        String T = scanner.next();

        System.out.println(findAllAnagram.solution(S, T));
    }
}
