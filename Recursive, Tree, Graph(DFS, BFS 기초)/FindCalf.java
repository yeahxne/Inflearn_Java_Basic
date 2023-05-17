package RecursiveAndTreeAndGraph;

import java.util.*;

/* BFS 로 최단거리 구하기*/
public class FindCalf {
    int answer = 0;
    int[] check;
    int[] distance = {1, -1, 5};  /* 앞으로 1,뒤로 1,앞으로 5 이동가능 */
    Queue<Integer> queue = new LinkedList<>();
    public int BFS(int S, int E) {
        check = new int[10001];
        check[S] = 1;  /* 출발지점: 현수의 위치 */
        queue.offer(S);
        int level = 0;  /* 트리의 레벨 값 */

        while(!queue.isEmpty()) {
            int len = queue.size();
            for(int i=0; i<len; i++) {
                int x = queue.poll();
                for(int j=0; j<3; j++) {
                    int nx = x+distance[j];  /* x 의 자식 */

                    if(nx==E) {
                        return level+1;
                    }

                    if(nx>=1 && nx<=10000 && check[nx]==0) {  /* 방문하지 않은 값일 경우에만 queue 에 추가 */
                        check[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        FindCalf findCalf = new FindCalf();
        Scanner scanner = new Scanner(System.in);

        int S = scanner.nextInt();  /* 현수의 위치(S) */
        int E = scanner.nextInt();  /* 송아지의 위치(E) */

        System.out.println(findCalf.BFS(S,E));
    }
}
