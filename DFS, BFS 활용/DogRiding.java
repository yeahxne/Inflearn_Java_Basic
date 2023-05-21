package DFSAndBFS;

import java.util.*;

public class DogRiding {
    static int answer=Integer.MIN_VALUE, C, N;

    public void DFS(int level, int weightSum, int[] nArray) {  /* weightSum: 부분집합의 합 */
        if(weightSum > C) {
            return;
        }
        if(level == N) {
            answer = Math.max(answer, weightSum);
        } else{
            DFS(level+1, weightSum+nArray[level], nArray);
            DFS(level+1, weightSum, nArray);
        }
    }

    public static void main(String[] args) {
        DogRiding dogRiding = new DogRiding();
        Scanner scanner = new Scanner(System.in);

        C = scanner.nextInt();
        N = scanner.nextInt();
        int[] nArray = new int[N];
        for(int i=0; i<N; i++) {
            nArray[i] = scanner.nextInt();
        }
        dogRiding.DFS(0, 0, nArray);
        System.out.println(answer);
    }
}
