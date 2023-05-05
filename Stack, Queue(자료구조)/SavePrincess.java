package StackAndQueue;

import java.util.*;

/* ■ Queue 에 값 추가
*  1. add(): 값 추가에 성공하면 true 반환 / queue 에 여유 공간이 없어서 추가에 실패하면 IllegalStateException 발생
*  2. offer(): 값 추가에 성공하면 true 반환 / 값 추가에 실패하면 false 반환
*  ■ Queue 에 값 삭제
*  1. remove(): queue 가 비어있을 때, 삭제하면 예외 발생
*  2. poll(): queue 가 비어있을 때, 삭제하면 null 반환
*  3. clear(): queue 비우기
*  ■ Queue 맨 앞 값 확인 → queue.peek() */
public class SavePrincess {
    public int solution(int N, int K) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();  /* Integer 형 queue 선언, LinkedList 이용 */
        for(int i=1; i<=N; i++) {
            queue.offer(i);
        }

        while(!queue.isEmpty()) {
            for(int i=1; i<K; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();  /* K를 외친 왕자 queue 에 값 삭제 */
            if(queue.size() == 1) {
                answer = queue.poll();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        SavePrincess savePrincess = new SavePrincess();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();  /* N: 왕자 수 */
        int K = scanner.nextInt();  /* K: 특정숫자 */

        System.out.println(savePrincess.solution(N, K));
    }
}
