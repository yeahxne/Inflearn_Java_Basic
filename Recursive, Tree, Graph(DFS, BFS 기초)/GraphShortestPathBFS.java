package RecursiveAndTreeAndGraph;

import java.util.*;

public class GraphShortestPathBFS {
    static int N, M;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] check, distance;

    public void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        check[v]=1;
        distance[v]=0;
        queue.offer(v);
        while(!queue.isEmpty()) {
            int cv = queue.poll();
            for(int nv : graph.get(cv)) {
                if(check[nv]==0) {
                    check[nv]=1;
                    queue.offer(nv);
                    distance[nv] = distance[cv]+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphShortestPathBFS graphShortestPathBFS = new GraphShortestPathBFS();
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=N; i++) {
            graph.add(new ArrayList<Integer>());
        }

        check = new int[N+1];
        distance = new int[N+1];

        for(int i=0; i<M; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph.get(a).add(b);
        }

        graphShortestPathBFS.BFS(1);
        for(int i=2; i<=N; i++) {
            System.out.println(i+" : "+distance[i]);
        }
    }
}
