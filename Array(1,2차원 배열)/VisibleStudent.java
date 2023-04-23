package Array;

import java.util.Scanner;

public class VisibleStudent {
    public int solution(int N, int[] height) {
        int answer = 1;  /* 가장 맨 앞에 있는 학생은 무조건 보이므로 1로 초기화 */
        int max = height[0];

        for(int i=1; i<N; i++) {
            if(max < height[i]) {
                answer++;
                max = height[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        VisibleStudent visibleStudent = new VisibleStudent();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] height = new int[N];

        for(int i=0; i< height.length; i++) {
            height[i] = scanner.nextInt();
        }

        System.out.println(visibleStudent.solution(N, height));
    }
}