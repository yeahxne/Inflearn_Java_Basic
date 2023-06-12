package DFSAndBFS;

import java.util.*;

public class FindPermutation {
    static int[] pm, ch, nArray;  /* pm: 순열의 결과 */
    static int N, M;

    public void DFS(int L) {
        if(L==M) {
            for(int x : pm) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
        else {
            for(int i=0; i<N; i++) {
                if(ch[i]==0) {
                    ch[i]=1;
                    pm[L]=nArray[i];
                    DFS(L+1);
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        FindPermutation findPermutation = new FindPermutation();
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();
        nArray = new int[N];
        for(int i=0; i<N; i++) {
            nArray[i] = scanner.nextInt();
        }
        ch = new int[N];
        pm = new int[M];
        findPermutation.DFS(0);
    }
}
