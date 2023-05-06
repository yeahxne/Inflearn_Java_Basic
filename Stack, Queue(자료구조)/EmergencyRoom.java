package StackAndQueue;

import java.util.*;

class Person {
    int id;  /* id, priority: 멤버변수(필드) */
    int priority;
    public Person(int id, int priority) {  /* 생성자 메소드(객체 생성시 호출되는 메소드) */
        this.id = id;
        this.priority = priority;
    }
}

public class EmergencyRoom {
    public int solution(int N, int M, int[] nArray){
        int answer = 0;
        Queue<Person> queue = new LinkedList<>();

        for(int i=0; i<N; i++) {
            queue.offer(new Person(i, nArray[i]));
        }
        while(!queue.isEmpty()) {
            Person tmp = queue.poll();
            for(Person x : queue) {
                if(x.priority > tmp.priority) {
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp != null) {
                answer++;
                if(tmp.id == M) {
                    return answer;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        EmergencyRoom emergencyRoom = new EmergencyRoom();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] nArray = new int[N];
        for(int i=0; i<N; i++) {
            nArray[i] = scanner.nextInt();
        }
        System.out.println(emergencyRoom.solution(N,M,nArray));
    }
}
