package Hash;

import java.util.HashMap;
import java.util.Scanner;

public class ClassPresident {
    public char solution(int N, String s) {
        char answer = ' ';  /* char 타입 변수 공백으로 초기화 */

        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);  /* getOrDefault: 찾는 키가 존재한다면 키의 값을 반환하고, 없다면 기본 값을 반환하는 메서드 */
        }

        int max = Integer.MIN_VALUE;

        /* entrySet(): map 에 entrySet() 함수를 사용하여 map 의 전체 key 와 value 를 꺼낸다. */
        /* keySet(): map 의 keySet() 함수를 사용하여 map 의 전체 key 를 꺼낸다. */
        for(char key : map.keySet()) {
            if(map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ClassPresident classPresident = new ClassPresident();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String s = scanner.next();

        System.out.println(classPresident.solution(N,s));
    }
}