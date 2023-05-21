package DFSAndBFS;

import java.util.*;

public class SubsetEqualSum {
    static String answer = "NO";
    static int N, total = 0;
    boolean flag = false;

    public void DFS(int level, int sum, int[] nArray) {
        if(flag == true) {
            return;
        }
        if(sum > total/2) {
            return;
        }
        if(level == N) {
            if((total-sum) == sum) {
                answer = "YES";
                flag = true;  /* 더이상 재귀를 돌 필요 없다. */
            }
        } else {
            DFS(level+1, sum+nArray[level], nArray);  /* 원소를 부분집합에 포함하는 경우 */
            DFS(level+1, sum, nArray);  /* 원소를 부분집합에 포함하지 않은 경우 */
        }
    }

    public static void main(String[] args) {
        SubsetEqualSum subsetEqualSum = new SubsetEqualSum();
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        int[] nArray = new int[N];
        for(int i=0; i<N; i++) {
            nArray[i] = scanner.nextInt();
            total += nArray[i];  /* nArray 의 값을 읽어들이면서 total 값 구하기(주어진 집합의 총합) */
        }

        subsetEqualSum.DFS(0, 0, nArray);
        System.out.println(answer);
    }
}
