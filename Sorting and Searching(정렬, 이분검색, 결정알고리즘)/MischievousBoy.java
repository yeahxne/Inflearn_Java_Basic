package SortingAndSearching;

import java.util.*;

public class MischievousBoy {
    public ArrayList<Integer> solution(int N, int[] nArray) {
        ArrayList<Integer> answer = new ArrayList<>();  /* 철수의 반 번호, 짝꿍의 반 번호 */
        int[] inputArray = nArray.clone();  /* 입력받은 배열 clone(깊은 복사) */

        Arrays.sort(nArray);  /* 학생들 오름차순 정렬(기준: 키) */

        for(int i=0; i<N; i++) {
            if(inputArray[i] != nArray[i]) {
                answer.add(i+1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        MischievousBoy mischievousBoy = new MischievousBoy();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] nArray = new int[N];
        for(int i=0; i<N; i++) {
            nArray[i] = scanner.nextInt();
        }

        for(int x : mischievousBoy.solution(N, nArray)) {
            System.out.print(x+" ");
        }
    }
}
