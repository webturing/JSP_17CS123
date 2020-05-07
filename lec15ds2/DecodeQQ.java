package lec15ds2;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DecodeQQ {
    public static void main(String[] args) {

        Queue<Integer> Q = new LinkedList<Integer>();
        int[] a = new int[]{6, 3, 1, 7, 5, 8, 9, 2, 4};
        for (int i : a) {
            Q.offer(i);//push
        }
        while (!Q.isEmpty()) {
            System.out.print(Q.peek());//front
            Q.poll();//pop
            if (Q.isEmpty()) break;

            int x = Q.peek();
            Q.offer(x);
            Q.poll();
        }
    }
}
