package RecursiveAndTreeAndGraph;

class Node {
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt=rt=null;
    }
}

public class BinaryTreeTraversal {
    Node root;
    public void DFS(Node root) {
        if(root == null) {
            return;
        } else {
            System.out.print(root.data+" ");  /* 전위 순회: 부모→왼쪽→오른쪽 */
            DFS(root.lt);
//            System.out.print(root.data+" ");  /* 중위 순회: 왼쪽→부모→오른쪽 */
            DFS(root.rt);
//            System.out.print(root.data+" ");  /* 후위 순회: 왼쪽→오른쪽→부모 */
        }
    }

    public static void main(String[] args) {
        BinaryTreeTraversal binaryTreeTraversal = new BinaryTreeTraversal();
        binaryTreeTraversal.root = new Node(1);
        binaryTreeTraversal.root.lt = new Node(2);
        binaryTreeTraversal.root.rt = new Node(3);
        binaryTreeTraversal.root.lt.lt = new Node(4);
        binaryTreeTraversal.root.lt.rt = new Node(5);
        binaryTreeTraversal.root.rt.lt = new Node(6);
        binaryTreeTraversal.root.rt.rt = new Node(7);
        binaryTreeTraversal.DFS(binaryTreeTraversal.root);
    }
}
