package SortingAndSearching;

import java.util.*;

public class DuplicateVerification {
    public String solution(int N, int[] nArray) {
        String answer = "U";

        for(int i=0; i<N-1; i++) {
            for(int j=i+1; j<N; j++) {
                if(nArray[i] == nArray[j]) {
                    return "D";
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        DuplicateVerification duplicateVerification = new DuplicateVerification();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] nArray = new int[N];
        for(int i=0; i<N; i++) {
            nArray[i] = scanner.nextInt();
        }
        System.out.println(duplicateVerification.solution(N, nArray));
    }
}
