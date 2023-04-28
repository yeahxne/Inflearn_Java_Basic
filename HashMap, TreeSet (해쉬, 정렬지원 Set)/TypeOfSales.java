package Hash;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class TypeOfSales {
    public ArrayList<Integer> solution(int N, int K, int[] nArray) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<K-1; i++) {  /* K-1만큼 요일의 매출 종류를 map 에 추가한다. */
            map.put(nArray[i], map.getOrDefault(nArray[i],0)+1);
        }

        int lt = 0;
        for(int rt=K-1; rt<N; rt++) {  /* 앞의 값은 빼주고, 뒤의 값은 더해주면서 검사한다. */
            map.put(nArray[rt], map.getOrDefault(nArray[rt],0)+1);
            answer.add(map.size());
            map.put(nArray[lt], map.get(nArray[lt])-1);
            if(map.get(nArray[lt]) == 0) {  /* 삭제하는 날의 매출값이 map 에서 0이라면 map 에서도 그 key 와 value 값을 삭제한다. */
                map.remove(nArray[lt]);
            }
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        TypeOfSales typeOfSales = new TypeOfSales();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] nArray = new int[N];
        for(int i=0; i<N; i++) {
            nArray[i] = scanner.nextInt();
        }

        for(int x : typeOfSales.solution(N,K,nArray)) {
            System.out.print(x+" ");
        }
    }
}
