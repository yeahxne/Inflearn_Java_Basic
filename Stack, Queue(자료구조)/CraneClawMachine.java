package StackAndQueue;

import java.util.*;

/* Stack 의 특징
*  1. 먼저 들어간 자료가 나중에 나옴. LIFO(Last In First Out) 구조
*  2. 그래프의 깊이 우선 탐색(DFS)에서 사용
*  3. 재귀적(Recursion) 함수를 호출할 때 사용 */
public class CraneClawMachine {
    public int solution(int N, int[][] nArray, int M, int[] mArray) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();  /* int 형 stack 선언 */

        for(int i=0; i<M; i++) {
            for(int j=0; j<N; j++) {
                if(nArray[j][mArray[i]-1] != 0) {
                    int tmp = nArray[j][mArray[i]-1];
                    nArray[j][mArray[i]-1] = 0;

                    /* 스택 가장 위에 있는 값을 출력하고 싶을 때, peek() 함수 사용 */
                    if(!stack.isEmpty() && tmp == stack.peek()) {  /* stack 이 비어있지 않으면서, stack 의 가장 상단의 값과 tmp 가 같은 경우 */
                        answer += 2;
                        stack.pop();
                    } else {  /* stack 의 가장 상단의 값과 tmp 가 다른 경우 */
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        CraneClawMachine craneClawMachine = new CraneClawMachine();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] nArray = new int[N][N];
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                nArray[i][j] = scanner.nextInt();
            }
        }

        int M = scanner.nextInt();
        int[] mArray = new int[M];
        for(int i=0; i<M; i++) {
            mArray[i] = scanner.nextInt();
        }

        System.out.println(craneClawMachine.solution(N, nArray, M, mArray));
    }
}
