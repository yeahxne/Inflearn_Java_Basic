package SortingAndSearching;

import java.util.*;

public class BubbleSort {
    public int[] solution(int N, int[] nArray) {
        for(int i=0; i<N-1; i++) {
            for(int j=0; j<N-i-1; j++) {  /* 가장 큰 수가 맨 마지막으로 정렬되기 때문에, 맨 마지막은 비교 안해도 됨 */
                if(nArray[j] > nArray[j+1]) {
                    int tmp = nArray[j];
                    nArray[j] = nArray[j+1];
                    nArray[j+1] = tmp;
                }
            }
        }
        return nArray;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] nArray = new int[N];
        for(int i=0; i<N; i++) {
            nArray[i] = scanner.nextInt();
        }

        for(int i=0; i<N; i++) {
            System.out.print(bubbleSort.solution(N, nArray)[i]+" ");
        }
    }
}
