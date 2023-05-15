package SortingAndSearching;

import java.util.*;

public class ChooseStable {
    public int count(int[] nArray, int dist) {
        int cnt = 1;
        int ep = nArray[0];

        for(int i=1; i<nArray.length; i++) {
            if(nArray[i]-ep >= dist) {
                cnt++;
                ep = nArray[i];
            }
        }
        return cnt;
    }

    public int solution(int N, int C, int[] nArray) {
        int answer = 0;
        Arrays.sort(nArray);
        int lt = Arrays.stream(nArray).min().getAsInt();
        int rt = Arrays.stream(nArray).max().getAsInt();

        while(lt<=rt) {
            int mid = (lt+rt)/2;
            if(count(nArray, mid)>=C) {
                answer = mid;
                lt = mid+1;
            } else {
                rt = mid-1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ChooseStable chooseStable = new ChooseStable();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();  /* N: 마구간의 개수 */
        int C = scanner.nextInt();  /* C: 말의 수 */
        int[] nArray = new int[N];
        for(int i=0; i<N; i++) {
            nArray[i] = scanner.nextInt();
        }

        System.out.println(chooseStable.solution(N,C,nArray));
    }
}
