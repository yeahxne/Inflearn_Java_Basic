package SortingAndSearching;

import java.util.*;

/* 객체를 사용자의 기준에 따라 비교하여 정렬하기 위해서는 Comparable 과 Comparator 를 사용하는 방법이 있다.
*  이들은 모두 인터페이스이며, 반드시 내부의 선언된 메서드를 재정의(Override)해야 한다.
*  ■ Comparable 은 compareTo(T o1) 메서드를 재정의 해주어야 함.
*  ■ Comparator 은 compare(T o1, T o2) 메서드를 재정의 해주어야 함.
*  */
class Coordinate implements Comparable<Coordinate>{
    public int x;
    public int y;

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Coordinate o) {  /* 오름차순 정렬 */
        if(this.x == o.x) {  /* x 좌표의 값이 같으면 y 좌표의 값으로 정렬 */
            return this.y-o.y;
        } else {  /* 그외 x 좌표를 기준으로 정렬 */
            return this.x-o.x;
        }
    }
}

public class CoordinateAlignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        ArrayList<Coordinate> nArray = new ArrayList<>();
        for(int i=0; i<N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            nArray.add(new Coordinate(x,y));
        }

        /* Override 한 compareTo 의 구현에 따라 sort 가 정렬을 해준다. */
        Collections.sort(nArray);

        for(Coordinate coordinate : nArray) {
            System.out.println(coordinate.x+" "+coordinate.y);
        }
    }
}
