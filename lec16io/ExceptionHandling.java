package lec16io;

import java.util.Arrays;

public class ExceptionHandling {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3};
        try {
            a[3]++;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("I catch it!");
            int[] a2 = new int[a.length * 2];
            System.arraycopy(a, 0, a2, 0, a.length);
            a = a2;
            a[3]++;
        }
        System.out.println(Arrays.toString(a));
    }
}
