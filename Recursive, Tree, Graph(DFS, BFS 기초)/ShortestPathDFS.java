package RecursiveAndTreeAndGraph;

/* Tree 말단노드까지의 가장 짧은 경로(DFS) */
class NodeDFS {
    int data;
    NodeDFS lt;
    NodeDFS rt;

    public NodeDFS(int val) {
        data = val;
        lt=rt=null;
    }
}

public class ShortestPathDFS {
    NodeDFS root;
    public int DFS(int level, NodeDFS root) {
        if(root.lt==null && root.rt==null) {  /* root 노드가 말단 노드일 경우 */
            return level;
        } else {
            return Math.min(DFS(level+1, root.lt), DFS(level+1, root.rt));
        }
    }


    public static void main(String[] args) {
        ShortestPathDFS shortestPathDFS = new ShortestPathDFS();
        shortestPathDFS.root = new NodeDFS(1);
        shortestPathDFS.root.lt = new NodeDFS(2);
        shortestPathDFS.root.rt = new NodeDFS(3);
        shortestPathDFS.root.lt.lt = new NodeDFS(4);
        shortestPathDFS.root.lt.rt = new NodeDFS(5);

        System.out.println(shortestPathDFS.DFS(0, shortestPathDFS.root));
    }
}
