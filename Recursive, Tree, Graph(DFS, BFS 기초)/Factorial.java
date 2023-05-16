package RecursiveAndTreeAndGraph;

import java.util.*;

public class Factorial {
    public int DFS(int N) {
        if(N == 1) {
            return 1;
        } else {
            return N*DFS(N-1);
        }
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        System.out.println(factorial.DFS(N));
    }
}
