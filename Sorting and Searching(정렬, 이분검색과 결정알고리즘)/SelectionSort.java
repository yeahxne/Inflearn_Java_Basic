package SortingAndSearching;

import java.util.*;

public class SelectionSort {
    public int[] solution(int N, int[] nArray) {
        for(int i=0; i<N-1; i++) {
            int idx = i;
            for(int j=i+1; j<N; j++) {
                if(nArray[j]<nArray[idx]) {
                    idx = j;
                }
            }
            int tmp = nArray[i];
            nArray[i] = nArray[idx];
            nArray[idx] = tmp;
        }
        return nArray;
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] nArray = new int[N];
        for(int i=0; i<N; i++) {
            nArray[i] = scanner.nextInt();
        }

        for(int i=0; i<N; i++) {
            System.out.print(selectionSort.solution(N, nArray)[i]+" ");
        }
    }
}
