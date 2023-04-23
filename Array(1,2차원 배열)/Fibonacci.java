package Array;

import java.util.Scanner;

public class Fibonacci {
    public int[] solution(int N) {
        int[] answer = new int[N];
        answer[0] = 1;
        answer[1] = 1;

        for(int i=2; i<N; i++) {
            answer[i] = answer[i-1]+answer[i-2];
        }
        return answer;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for(int i=0; i<N; i++) {
            System.out.print(fibonacci.solution(N)[i]+" ");
        }
    }
}
