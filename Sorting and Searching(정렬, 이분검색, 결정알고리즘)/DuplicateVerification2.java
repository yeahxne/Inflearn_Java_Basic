package SortingAndSearching;

import java.util.*;

public class DuplicateVerification2 {
    public String solution(int N, int[] nArray) {
        String answer = "U";
        Arrays.sort(nArray);  /* 오름차순으로 정렬 */

        for(int i=0; i<N-1; i++) {
            if(nArray[i] == nArray[i+1]) {  /* 이웃한 두 개의 숫자 비교 */
                return "D";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        DuplicateVerification2 duplicateVerification2 = new DuplicateVerification2();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] nArray = new int[N];
        for(int i=0; i<N; i++) {
            nArray[i] = scanner.nextInt();
        }
        System.out.println(duplicateVerification2.solution(N, nArray));
    }
}
