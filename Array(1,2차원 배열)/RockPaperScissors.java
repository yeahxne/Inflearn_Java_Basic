package Array;

import java.util.Scanner;

public class RockPaperScissors {
    public char[] solution(int N, int[] A, int[] B) {
        char[] answer = new char[N];

        for(int i=0; i<N; i++) {
            if(A[i] == B[i]) {
                answer[i] = 'D';
            } else if((A[i]==1 && B[i]==3) || (A[i]==2 && B[i]==1) || (A[i]==3 && B[i]==2)) {
                answer[i] = 'A';
            } else {
                answer[i] = 'B';
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();  /* 회수 */

        int[] A = new int[N];  /* A의 정보 */
        for(int i=0; i<N; i++) {
            A[i] = scanner.nextInt();
        }

        int[] B = new int[N];  /* B의 정보 */
        for(int i=0; i<N; i++) {
            B[i] = scanner.nextInt();
        }

        for(char answer : rockPaperScissors.solution(N, A, B)) {
            System.out.println(answer);
        }
    }
}
