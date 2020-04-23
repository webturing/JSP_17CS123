package lec11corejava.hp;

import java.math.BigDecimal;

public class BigDecimalDemo2 {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("1.0");
        BigDecimal b = new BigDecimal("7.0");
        System.out.println(a.divide(b,100,BigDecimal.ROUND_HALF_EVEN));
        System.out.println(142857*1);
        System.out.println(142857*2);
        System.out.println(142857*3);
        System.out.println(142857*4);
        System.out.println(142857*5);
        System.out.println(142857*6);
        System.out.println(142857*7);
    }
}
