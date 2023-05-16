package RecursiveAndTreeAndGraph;

import java.util.LinkedList;
import java.util.Queue;

class NodeBFS {
    int data;
    NodeBFS lt, rt;
    public NodeBFS(int val) {
        data = val;
        lt=rt=null;
    }
}

public class BinaryTreeLevelTraversal {
    NodeBFS root;
    public void BFS(NodeBFS root) {
        Queue<NodeBFS> queue = new LinkedList<>();
        queue.offer(root);  /* queue 에 root node 의 데이터 저장 */
        int level = 0;  /* root node 의 level: 0 */

        while(!queue.isEmpty()) {
            int len = queue.size();
            for(int i=0; i<len; i++) {
                NodeBFS current = queue.poll();  /* 현재 node */
                System.out.print(current.data+" ");

                if(current.lt!=null) {  /* 현재 node 의 왼쪽 node 가 null 이 아닐 경우 */
                    queue.offer(current.lt);
                }
                if(current.rt!=null) {  /* 현재 node 의 오른쪽 node 가 null 이 아닐 경우 */
                    queue.offer(current.rt);
                }
            }
            level++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BinaryTreeLevelTraversal binaryTreeLevelTraversal = new BinaryTreeLevelTraversal();
        binaryTreeLevelTraversal.root = new NodeBFS(1);
        binaryTreeLevelTraversal.root.lt = new NodeBFS(2);
        binaryTreeLevelTraversal.root.rt = new NodeBFS(3);
        binaryTreeLevelTraversal.root.lt.lt = new NodeBFS(4);
        binaryTreeLevelTraversal.root.lt.rt = new NodeBFS(5);
        binaryTreeLevelTraversal.root.rt.lt = new NodeBFS(6);
        binaryTreeLevelTraversal.root.rt.rt = new NodeBFS(7);
        binaryTreeLevelTraversal.BFS(binaryTreeLevelTraversal.root);
    }
}
