package RecursiveAndTreeAndGraph;

import java.util.*;

public class FindSubset {
    static int N;
    static int[] check;  /* check 배열 index 를 부분집합에 포함할지(1) 안할지(0) */

    public void DFS(int L) {
        if(L==N+1) {
            String tmp = "";
            for(int i=1; i<=N; i++) {
                if(check[i]==1) {
                    tmp += (i+" ");
                }
            }
            if(tmp.length()>0) {  /* 공집합일 경우, 출력X */
                System.out.println(tmp);
            }
        } else {
            check[L] = 1;
            DFS(L+1);
            check[L] = 0;
            DFS(L+1);
        }
    }

    public static void main(String[] args) {
        FindSubset findSubset = new FindSubset();
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        check = new int[N+1];

        findSubset.DFS(1);
    }
}
