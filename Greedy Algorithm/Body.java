package GreedyAlgorithm;

public class Body implements Comparable<Body> {  /* Comparable interface 를 implements 한다. */
    public int h, w;

    Body(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Body o) {
        return o.h - this.h;  /* 키(h)를 기준으로 내리차순 정렬 */
        //return this.h - o.h /* 키(h)를 기준으로 오름차순 정렬 */
    }
}
