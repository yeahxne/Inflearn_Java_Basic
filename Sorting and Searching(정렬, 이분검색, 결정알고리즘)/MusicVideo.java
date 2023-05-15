package SortingAndSearching;

import java.util.*;

public class MusicVideo {
    public int count(int[] nArray, int capacity) {  /* 해당 capacity 로 DVD 몇 장이 필요한지 return */
        int cnt = 1;  /* DVD 의 장 수 */
        int sum = 0;

        for(int x : nArray) {
            if(sum+x > capacity) {
                cnt++;
                sum = x;
            } else {
                sum += x;
            }
        }
        return cnt;
    }

    public int solution(int N, int M, int[] nArray) {
        int answer = 0;  /* DVD 의 최소 용량 크기 */
        int lt = Arrays.stream(nArray).max().getAsInt();  /* 해당 배열에서 가장 큰 수를 찾아줌 */
        int rt = Arrays.stream(nArray).sum();  /* 해당 배열의 값을 전부 합함 */

        while(lt<=rt) {
            int mid = (lt+rt)/2;  /* DVD 한 장의 용량 */
            if(count(nArray, mid) <= M) {  /* return 한 DVD 장 수가 M보다 작거나 같을 경우 */
                answer = mid;
                rt = mid-1;
            } else {  /* M개의 DVD 에 녹화가 불가능할 경우 */
                lt = mid+1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        MusicVideo musicVideo = new MusicVideo();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] nArray = new int[N];
        for(int i=0; i<N; i++) {
            nArray[i] = scanner.nextInt();
        }

        System.out.println(musicVideo.solution(N,M,nArray));
    }
}
