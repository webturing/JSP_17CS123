package lec13array.sort;

import java.util.Arrays;


public class ArraysDemo {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        int[] b = a;//shallow copy

        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        System.out.println("a==b"+(a==b));
        System.out.println("a.equals(b) "+ a.equals(b));
        System.out.println("a==c"+(a==c));
        System.out.println("a.equals(c) "+ a.equals(c));//??

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));


    }
}
