package lec14ds1;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        for (int i = 0; i < 100; i++) {
            v.add(i);

        }
        System.out.println(v);
        System.out.println(v.indexOf(7));
        System.out.println(v.contains(7));

    }
}
