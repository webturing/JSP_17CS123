package lec16io;

import java.util.Arrays;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3};
        int x;
        try {
            a[2]++;
            x = 1 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArithmeticException caught!");
            a = new int[4];
            a[3]++;
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught!");
            x = 0;
        }finally {
            System.err.println("I am finally block!!");
        }
        System.out.println(Arrays.toString(a));
    }
}
