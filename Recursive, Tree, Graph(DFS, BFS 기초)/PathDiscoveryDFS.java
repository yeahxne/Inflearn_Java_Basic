package RecursiveAndTreeAndGraph;

import java.util.*;
public class PathDiscoveryDFS {
    static int N,M,answer=0;
    static int[][] graph;
    static int[] check;
    public void DFS(int value) {
        if(value == N) {
            answer++;
        } else {
            for(int i=1; i<=N; i++) {
                if(graph[value][i]==1 && check[i]==0) {
                    check[i] = 1;
                    DFS(i);
                    check[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        PathDiscoveryDFS pathDiscoveryDFS = new PathDiscoveryDFS();
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();  /* 노드의 개수: N */
        M = scanner.nextInt();  /* 간선의 개수: M */
        graph = new int[N+1][M+1];
        check = new int[N+1];

        for(int i=0; i<M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph[a][b] = 1;
        }

        check[1] = 1;  /* 출발지점: 노드1 */
        pathDiscoveryDFS.DFS(1);
        System.out.println(answer);
    }
}
