package lec13array.search;

import java.util.Arrays;

public class BinarySearchApp {
    public static void main(String[] args) {
        int[] a = new int[1024];//
        for (int i = 0; i < a.length; i++) {
            a[i] = i * i * i;
        }
        System.out.println(Arrays.toString(a));
        int k = -27;
        int pos = Arrays.binarySearch(a, Math.abs(k));
        if (pos < 0) {
            System.out.println("N");
        } else {
            System.out.println("Y");
        }
    }
}
