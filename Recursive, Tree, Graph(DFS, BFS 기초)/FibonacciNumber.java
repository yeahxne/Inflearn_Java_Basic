package RecursiveAndTreeAndGraph;

import java.util.*;

public class FibonacciNumber {
    public int DFS(int N) {
        if(N==1) {
            return 1;
        } else if(N==2) {
            return 1;
        } else {
            return DFS(N-2)+DFS(N-1);
        }
    }

    public static void main(String[] args) {
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        for(int i=1; i<=N; i++) {
            System.out.print(fibonacciNumber.DFS(i)+" ");
        }
    }
}
