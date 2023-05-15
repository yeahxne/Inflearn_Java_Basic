package RecursiveAndTreeAndGraph;

public class RecursiveFunction {
    public void DFS(int N) {
        if(N == 0) {
            return;  /* 반환값이 void 일 때 return 하는 경우, '함수종료' */
        } else {
            DFS(N-1);
            System.out.print(N+" ");
        }
    }

    public static void main(String[] args) {
        RecursiveFunction recursiveFunction = new RecursiveFunction();
        recursiveFunction.DFS(3);
    }
}
