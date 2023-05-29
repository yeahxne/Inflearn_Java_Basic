package DFSAndBFS;

import java.util.*;

public class ExchangeOfCoins {
    static int N;  /* N: 동전의 종류개수 */
    static int M;  /* M: 거슬러 줄 금액 */
    static int answer = Integer.MAX_VALUE;
    public void DFS(int level, int sum, int[] nArray) {
        if(sum > M) {
            return;
        }
        if(sum == M) {
            answer = Math.min(answer, level);
        } else {
            for(int i=0; i<N; i++) {
                DFS(level+1, sum+nArray[i], nArray);
            }
        }
    }

    public static void main(String[] args) {
        ExchangeOfCoins exchangeOfCoins = new ExchangeOfCoins();
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        int[] nArray = new int[N];
        for(int i=0; i<N; i++) {
            nArray[i] = scanner.nextInt();
        }
        M = scanner.nextInt();

        exchangeOfCoins.DFS(0,0,nArray);
        System.out.println(answer);
    }
}
