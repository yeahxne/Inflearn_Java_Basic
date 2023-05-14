package SortingAndSearching;

import java.util.*;

public class BinarySearch {
    public int solution(int N, int M, int[] nArray) {
        int answer = 0;
        Arrays.sort(nArray);

        int lt = 0, rt = N-1;

        while(lt<=rt) {
            int mid = (lt+rt)/2;
            if(nArray[mid] == M) {
                answer = mid+1;
                break;
            }
            if(nArray[mid] > M) {
                rt = mid-1;
            } else {
                lt = mid+1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] nArray = new int[N];
        for(int i=0; i<N; i++) {
            nArray[i] = scanner.nextInt();
        }

        System.out.println(binarySearch.solution(N,M,nArray));
    }
}
