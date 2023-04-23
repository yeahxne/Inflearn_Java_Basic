package TwoPointersAndSlidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineTwoArrays2 {
    public ArrayList<Integer> solution(int N, int[] nArray, int M, int[] mArray) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;

        while(p1<N && p2<M) {
            if(nArray[p1] < mArray[p2]) {
                answer.add(nArray[p1++]);  /* 후위 증감 */
            } else {
                answer.add(mArray[p2++]);
            }
        }

        while(p1<N) {  /* p1이 남아있을 경우 */
            answer.add(nArray[p1++]);
        }

        while(p2<M) {  /* p2가 남아있을 경우 */
            answer.add(mArray[p2++]);
        }
        return answer;
    }


    public static void main(String[] args) {
        CombineTwoArrays2 combineTwoArrays2 = new CombineTwoArrays2();
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

        for(int i=0; i<N+M; i++) {
            System.out.print(combineTwoArrays2.solution(N, nArray, M, mArray).get(i)+" ");
        }
    }
}
