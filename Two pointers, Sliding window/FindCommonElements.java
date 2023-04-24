package TwoPointersAndSlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindCommonElements {
    public ArrayList<Integer> solution(int N, int[] nArray, int M, int[] mArray) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;

        Arrays.sort(nArray);
        Arrays.sort(mArray);

        while(p1<N && p2<M) {
            if(nArray[p1] == mArray[p2]) {
                answer.add(nArray[p1]);
                p1++;
                p2++;
            } else if(nArray[p1] < mArray[p2]) {
                p1++;
            } else {
                p2++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        FindCommonElements findCommonElements = new FindCommonElements();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] nArray = new int[N];
        for(int i=0; i<N; i++) {
            nArray[i] = scanner.nextInt();
        }

        int M = scanner.nextInt();
        int[] mArray = new int[M];
        for(int i=0; i<M; i++) {
            mArray[i] = scanner.nextInt();
        }

        ArrayList<Integer> answer = findCommonElements.solution(N, nArray, M, mArray);
        for(int i=0; i<answer.size(); i++) {
            System.out.print(answer.get(i)+" ");
        }
    }
}
