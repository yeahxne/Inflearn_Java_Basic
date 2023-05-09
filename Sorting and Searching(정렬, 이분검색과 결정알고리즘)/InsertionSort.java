package SortingAndSearching;

import java.util.*;

public class InsertionSort {
    public int[] solution(int N, int[] nArray) {
        for(int i=1; i<N; i++) {
            int tmp = nArray[i];
            int j;

            for(j=i-1; j>=0; j--) {
                if(nArray[j] > tmp) {
                    nArray[j+1] = nArray[j];
                } else {
                    break;
                }
            }
            nArray[j+1] = tmp;
        }
        return nArray;
    }

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] nArray = new int[N];
        for(int i=0; i<N; i++) {
            nArray[i] = scanner.nextInt();
        }

        for(int i=0; i<N; i++) {
            System.out.print(insertionSort.solution(N, nArray)[i]+" ");
        }
    }
}
