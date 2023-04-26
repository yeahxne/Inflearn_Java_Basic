package TwoPointersAndSlidingWindow;

import java.util.Scanner;

public class SumConsecutiveNaturalNumber2 {
    public int solution(int N) {
        int answer = 0, cnt = 1;  /* cnt: 연속된 자연수의 개수 */
        N--;
        while (N>0) {
            cnt++;
            N = N-cnt;
            if(N%cnt == 0) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        SumConsecutiveNaturalNumber2 sumConsecutiveNaturalNumber2 = new SumConsecutiveNaturalNumber2();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        System.out.println(sumConsecutiveNaturalNumber2.solution(N));
    }
}
