package TwoPointersAndSlidingWindow;

import java.util.Scanner;

public class ContinuousSubsequences {
    public int solution(int N, int M, int[] nArray) {
        int answer = 0;
        int sum = 0, lt = 0;

        for (int rt = 0; rt < N; rt++) {
            sum += nArray[rt];
            if (sum == M) {
                answer++;
            }
            while (sum >= M) {
                sum -= nArray[lt++];
                if (sum == M) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ContinuousSubsequences continuousSubsequences = new ContinuousSubsequences();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] nArray = new int[N];
        for(int i=0; i<N; i++) {
            nArray[i] = scanner.nextInt();
        }

        System.out.println(continuousSubsequences.solution(N, M, nArray));
    }
}
