package RecursiveAndTreeAndGraph;

import SortingAndSearching.BinarySearch;

import java.util.*;

public class BinaryOutput {
    public void DFS(int N) {
        if(N == 0) {
            return;
        } else {
            DFS(N/2);
            System.out.print(N%2);
        }
    }

    public static void main(String[] args) {
        BinaryOutput binaryOutput = new BinaryOutput();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        binaryOutput.DFS(N);
    }
}
