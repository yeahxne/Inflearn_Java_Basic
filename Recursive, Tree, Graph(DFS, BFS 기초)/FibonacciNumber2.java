package RecursiveAndTreeAndGraph;

import java.util.Scanner;

public class FibonacciNumber2 {
    static int[] fibo;
    public int DFS(int N) {
        if(fibo[N]>0) {  /* ★메모이제이션 */
            return fibo[N];
        }

        if(N==1) {
            return fibo[N]=1;
        } else if(N==2) {
            return fibo[N]=1;
        } else {
            return fibo[N]=DFS(N-2)+DFS(N-1);
        }
    }

    public static void main(String[] args) {
        FibonacciNumber2 fibonacciNumber2 = new FibonacciNumber2();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        fibo = new int[N+1];  /* 배열 0으로 초기화 */
        fibonacciNumber2.DFS(N);

        for(int i=1; i<=N; i++) {
            System.out.print(fibo[i]+" ");
        }
    }
}
