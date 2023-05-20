package RecursiveAndTreeAndGraph;

import java.util.*;

public class PathDiscoveryAdjacencyList {
    static int N, M, answer = 0;
    static ArrayList<ArrayList<Integer>> graph;  /* ArrayList 를 저장할 수 있는 ArrayList: graph */
    static int[] check;
    public void DFS(int value) {
        if(value==N) {
            answer++;
        } else {
            for(int nextValue : graph.get(value)) {  /* value 번째 ArrayList - ArrayList 탐색할 때는 for-each 문이 좋다.*/
                if(check[nextValue]==0) {  /* nextValue 를 방문하지 않았을 경우 */
                    check[nextValue]=1;
                    DFS(nextValue);
                    check[nextValue]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        PathDiscoveryAdjacencyList pathDiscoveryAdjacencyList = new PathDiscoveryAdjacencyList();
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();  /* 정점의 개수: N */
        M = scanner.nextInt();  /* 간선의 개수: M */

        graph = new ArrayList<ArrayList<Integer>>();  /* 정점이 많을 경우, ArrayList 로 구현한다. */
        for(int i=0; i<=N; i++) {
            graph.add(new ArrayList<Integer>());
        }

        check = new int[N+1];
        for(int i=0; i<M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph.get(a).add(b);
        }

        check[1] = 1;
        pathDiscoveryAdjacencyList.DFS(1);
        System.out.println(answer);
    }
}
