package GreedyAlgorithm;

import java.util.*;

class Time implements Comparable<Time> {
    public int s, e;
    Time(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Time o) {
        /* 회의가 끝나는 시간이 모두 같을 경우, 회의가 시작하는 시간으로 기준으로 오름차순 정렬 */
        if(this.e == o.e) {
            return this.s - o.s;
        }
        /* 회의가 끝나는 시간을 기준으로 오름차순 정렬 */
        else {
            return this.e - o.e;
        }
    }
}

class AllocationConferenceRoom {
    public int solution(ArrayList<Time> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);
        int endTime = 0;
        for(Time ob : arr) {
            if(ob.s >= endTime) {
                cnt++;
                endTime = ob.e;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        AllocationConferenceRoom allocationConferenceRoom = new AllocationConferenceRoom();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int s = scanner.nextInt();
            int e = scanner.nextInt();
            arr.add(new Time(s,e));
        }
        System.out.println(allocationConferenceRoom.solution(arr, n));
    }
}
