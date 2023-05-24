package DFSAndBFS;

import java.util.Scanner;

public class RedundantPermutation {
    static int[] pm;
    static int N, M;
    public void DFS(int level) {
        if(level == M) {
            for(int x : pm) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
        else {
            for(int i=1; i<=N; i++) {
                pm[level] = i;
                DFS(level+1);
            }
        }
    }

    public static void main(String[] args) {
        RedundantPermutation redundantPermutation = new RedundantPermutation();
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();
        pm = new int[M];

        redundantPermutation.DFS(0);
    }
}
