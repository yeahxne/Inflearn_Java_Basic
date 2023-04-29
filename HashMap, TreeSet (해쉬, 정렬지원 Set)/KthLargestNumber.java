package Hash;

import java.util.*;

public class KthLargestNumber {
    public int solution(int N, int K, int[] nArray) {
        int answer = -1;
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());  /* TreeSet: 중복 제거+정렬 */

        for(int i=0; i<N; i++) {
            for(int j=i+1; j<N; j++) {
                for(int l=j+1; l<N; l++) {
                    set.add(nArray[i]+nArray[j]+nArray[l]);
                }
            }
        }

        int cnt = 0;
        for(int x : set) {
            cnt++;
            if(cnt == K) {
                return x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        KthLargestNumber kthLargestNumber = new KthLargestNumber();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] nArray = new int[N];
        for(int i=0; i<N; i++) {
            nArray[i] = scanner.nextInt();
        }

        System.out.println(kthLargestNumber.solution(N, K, nArray));
    }
}
