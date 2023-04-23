package Array;

import java.util.*;
public class CalculateScore {
    public int solution(int n, int[] arr) {
        int answer = 0;
        int score = 0;

        for(int i=0; i<n; i++) {
            if(arr[i] == 1) {
                score++;
                answer += score;
            } else {
                score = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        CalculateScore calculateScore = new CalculateScore();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(calculateScore.solution(n, arr));
    }
}
