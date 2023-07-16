package GreedyAlgorithm;

import java.util.*;

public class Wrestler {
    public int solution(ArrayList<Body> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);  // compareTo() 메서드 override(내림차순 정렬)
        int max = Integer.MIN_VALUE;
        for(Body ob : arr) {
            if(ob.w > max) {
                max = ob.w;
                cnt++;  /* 몸무게(w)의 최대값이 발견될 때, cnt++함 */
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Wrestler wrestler = new Wrestler();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            arr.add(new Body(h,w));
        }
        System.out.println(wrestler.solution(arr, n));
    }
}
