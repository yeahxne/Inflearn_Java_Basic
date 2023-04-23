package TwoPointersAndSlidingWindow;

import java.util.Arrays;
import java.util.Scanner;

public class CombineTwoArrays1 {
    public int[] solution(int N, int[] nArray, int M, int[] mArray) {
        int[] answer = new int[N+M];

        /* System.arraycopy(src, srcPos, dest, destPos, length)
        *  Object src: 복사하고자 하는 소스(원본)
        *  int srcPos: 위의 원본 소스에서 어느 부분부터 읽어올지 위치를 정해줌
        *  Object dest: 복사할 소스(복사하려는 대상)
        *  int destPos: 위의 복사본에서 자료를 받을 때, 어느 부분부터 쓸 것인지 시작위치를 정해줌.
        *  int length: 원본에서 복사본으로 데이터를 읽어서 쓸 데이터 길이 */
        System.arraycopy(nArray, 0, answer, 0, N);
        System.arraycopy(mArray, 0, answer, N, M);

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        CombineTwoArrays1 combineTwoArrays1 = new CombineTwoArrays1();
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
            System.out.print(combineTwoArrays1.solution(N, nArray, M, mArray)[i]+" ");
        }
    }
}
