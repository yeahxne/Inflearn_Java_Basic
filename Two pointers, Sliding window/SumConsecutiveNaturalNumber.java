package TwoPointersAndSlidingWindow;

import java.util.Scanner;

public class SumConsecutiveNaturalNumber {
    public int solution(int N) {
        int answer = 0;
        int sum = 0;  /* 양의 정수 합 */
        int lt = 0;

        int[] nArray = new int[(N/2)+1];
        for(int i=0; i<(N/2)+1; i++) {
            nArray[i] = i+1;
        }

        for(int rt=0; rt<nArray.length; rt++) {
            sum += nArray[rt];
            if(sum == N) {
                answer++;
            }
            while(sum >= N) {
                sum -= nArray[lt++];
                if(sum == N) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        SumConsecutiveNaturalNumber sumConsecutiveNaturalNumber = new SumConsecutiveNaturalNumber();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        System.out.println(sumConsecutiveNaturalNumber.solution(N));
    }
}
