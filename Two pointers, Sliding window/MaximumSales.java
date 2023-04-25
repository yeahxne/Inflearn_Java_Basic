package TwoPointersAndSlidingWindow;

import java.util.Scanner;

public class MaximumSales {
    public int solution(int N, int K, int[] nArray) {
        int answer = 0;
        int sum = 0;

        for(int i=0; i<K; i++) {
            sum += nArray[i];
        }
        answer = sum;

        for(int i=K; i<N; i++) {
            sum = sum+nArray[i]-nArray[i-K];
            if(answer < sum) {
                answer = sum;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        MaximumSales maximumSales = new MaximumSales();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] nArray = new int[N];
        for(int i=0; i<N; i++) {
            nArray[i] = scanner.nextInt();
        }

        System.out.println(maximumSales.solution(N, K, nArray));
    }
}
