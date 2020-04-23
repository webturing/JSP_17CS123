package lec11corejava.hp;

import java.math.BigInteger;

public class MathDemo {
    public static void main(String[] args) {
        //计算50!的长度
        int n = 50;
        double s = 0;
        for (int i = 2; i <= n; i++) {
            s += Math.log10(i);
        }
        System.out.println(Math.ceil(s));
        //以下是验证
        BigInteger p = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            p = p.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(p);
        System.out.println(p.toString().length());
    }
}
