package Array;

import java.util.*;
public class MaximumSum {
    public int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;  /* sum 변수와 계속 비교할 숫자 */
        int sum1;  /* 열의 합 */
        int sum2;  /* 행의 합 */

        for(int i=0; i<n; i++) {
            sum1 = 0;
            sum2 = 0;

            for(int j=0; j<n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = 0;
        sum2 = 0;
        for(int i=0; i<n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n-1-i];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        MaximumSum maximumSum = new MaximumSum();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println(maximumSum.solution(n, arr));
    }
}
