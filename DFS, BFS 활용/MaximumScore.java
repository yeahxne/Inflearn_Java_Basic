package DFSAndBFS;

import java.util.*;

public class MaximumScore {
    static int N, M;  /* N: 문제의 개수, M: 제한 시간 */
    static int answer = Integer.MIN_VALUE;  /* 최대 점수 */
    boolean flag = false;
    public void DFS(int level, int sum, int time, int[] ps, int[] pt) {  /* ps: problem score, pt: problem time */
        if(time > M) {
            return;
        }
        if(level == N) {
            answer = Math.max(answer, sum);
        } else {
            DFS(level+1, sum+ps[level], time+pt[level], ps, pt);
            DFS(level+1, sum, time, ps, pt);
        }
    }

    public static void main(String[] args) {
        MaximumScore maximumScore = new MaximumScore();
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();

        int[] a = new int[N];  /* a: 각 문제의 점수 */
        int[] b = new int[N];  /* b: 각 문제를 푸는 데 걸리는 시간 */
        for(int i=0; i<N; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }

        maximumScore.DFS(0,0,0,a,b);
        System.out.println(answer);
    }
}
