package TwoPointersAndSlidingWindow;

import java.util.Scanner;

public class MaxLenContFracSeq {
    public int solution(int N, int k, int[] nArray) {
        int answer = 0, lt = 0;
        int cnt = 0; /* cnt: 0을 1로 바꾼 횟수 */

        for(int rt=0; rt<N; rt++) {
            if(nArray[rt] == 0) {
                cnt++;
            }
            while(cnt>k) {
                if(nArray[lt] == 0) {
                    cnt--;
                }
                lt++;
            }
            answer=Math.max(answer, rt-lt+1);  /* 수열의 길이: rt-lt+1 */
        }
        return answer;
    }

    public static void main(String[] args) {
        MaxLenContFracSeq maxLenContFracSeq = new MaxLenContFracSeq();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int k = scanner.nextInt();

        int[] nArray = new int[N];
        for(int i=0; i<N; i++) {
            nArray[i] = scanner.nextInt();
        }
        System.out.println(maxLenContFracSeq.solution(N, k, nArray));
    }
}
