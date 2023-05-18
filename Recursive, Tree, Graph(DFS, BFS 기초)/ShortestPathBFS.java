package RecursiveAndTreeAndGraph;

import java.util.LinkedList;
import java.util.Queue;

/* Tree 말단노드까지의 가장 짧은 경로(BFS) */
public class ShortestPathBFS {
    NodeBFS root;

    public int BFS(NodeBFS root) {
        Queue<NodeBFS> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while(!queue.isEmpty()) {
            int length = queue.size();
            for(int i=0; i<length; i++) {
                NodeBFS current = queue.poll();
                if(current.lt==null && current.rt==null) {
                    return level;
                }
                if(current.lt!=null) {
                    queue.offer(current.lt);
                }
                if(current.rt!=null) {
                    queue.offer(current.rt);
                }
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        ShortestPathBFS shortestPathBFS = new ShortestPathBFS();
        shortestPathBFS.root = new NodeBFS(1);
        shortestPathBFS.root.lt = new NodeBFS(2);
        shortestPathBFS.root.rt = new NodeBFS(3);
        shortestPathBFS.root.lt.lt = new NodeBFS(4);
        shortestPathBFS.root.lt.rt = new NodeBFS(5);

        System.out.println(shortestPathBFS.BFS(shortestPathBFS.root));
    }
}
