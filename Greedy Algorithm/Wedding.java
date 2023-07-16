package GreedyAlgorithm;

import java.util.*;

class TimeState implements Comparable<TimeState> {
    public int time;
    public char state;  /* 's':도착한 시간, 'e':떠난 시간 */
    TimeState(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(TimeState ob) {
        if(this.time == ob.time) {  /* 시간이 같을 경우, 상태 값으로 오름차순 정렬 */
            return this.state - ob.state;
        }
        else {  /* 시간이 같지 않을 경우, 시간으로 오름차순 정렬 */
            return this.time - ob.time;
        }
    }
}

class Wedding {
    public int solution(ArrayList<TimeState> arr) {
        int answer = Integer.MIN_VALUE;
        Collections.sort(arr);  /* compareTo 기준에 의해서 정렬 */
        int cnt = 0;
        for(TimeState ob : arr) {
            if(ob.state == 's') {
                cnt++;
            }
            else {
                cnt--;
            }
            answer = Math.max(answer, cnt);
        }
        return answer;
    }

    public static void main(String[] args) {
        Wedding wedding = new Wedding();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<TimeState> arr = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int startTime = scanner.nextInt();
            int endTime = scanner.nextInt();
            arr.add(new TimeState(startTime, 's'));
            arr.add(new TimeState(endTime, 'e'));
        }
        System.out.println(wedding.solution(arr));
    }
}
