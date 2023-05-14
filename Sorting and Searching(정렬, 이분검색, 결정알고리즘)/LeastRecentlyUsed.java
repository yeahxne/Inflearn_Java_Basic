package SortingAndSearching;

import java.util.*;
public class LeastRecentlyUsed {
    public int[] solution(int S, int N, int[] nArray) {
        int[] cache = new int[S];  /* cache: 캐시 배열 */

        for(int x : nArray) {
            int pos = -1;  /* pos: index 번호 */
            for(int i=0; i<S; i++) {
                if(x == cache[i]) {  /* Hit 인 경우, Hit 된 지점에 인덱스 저장 */
                    pos = i;
                }
            }
            if(pos == -1) {  /* Cache Miss 인 경우(해야할 작업이 캐시에 없는 상태) */
                for(int i=S-1; i>=1; i--) {
                    cache[i] = cache[i-1];
                }
            } else {  /* Cache Hit 인 경우(해야할 작업이 캐시에 있는 상태) */
                for(int i=pos; i>=1; i--) {
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;
        }
        return cache;
    }

    public static void main(String[] args) {
        LeastRecentlyUsed leastRecentlyUsed = new LeastRecentlyUsed();
        Scanner scanner = new Scanner(System.in);

        int S = scanner.nextInt();
        int N = scanner.nextInt();

        int[] nArray = new int[N];
        for(int i=0; i<N; i++) {
            nArray[i] = scanner.nextInt();
        }

        for(int i=0; i<S; i++) {
            System.out.print(leastRecentlyUsed.solution(S,N,nArray)[i]+" ");
        }
    }
}
