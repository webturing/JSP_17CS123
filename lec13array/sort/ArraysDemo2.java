package lec13array.sort;

import java.util.Arrays;
import java.util.Comparator;


public class ArraysDemo2 {
    public static void main(String[] args) {
        Integer[] a = new Integer[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 0};

        int x=a[0];//unboxing;
        Integer y=5;//boxing

        Arrays.sort(a,3,7);//区间排序
        System.out.println(Arrays.toString(a));
        Arrays.sort(a, (ia, ib) -> ib-ia);
        System.out.println(Arrays.toString(a));


    }
}
