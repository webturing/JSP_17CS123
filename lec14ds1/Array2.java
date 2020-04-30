package lec14ds1;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[] a = new int[3];
        int j = 0;//集合的元素个数
        a[j++] = 1;
        a[j++] = 2;
        a[j++] = 3;
        //容量加倍 倍增
        int[] b = new int[a.length * 2];
        for (int i = 0; i < j; i++) {
            b[i] = a[i];
        }
        a = b;
        a[j++] = 4;


        System.out.println(Arrays.toString(a));
    }
}
