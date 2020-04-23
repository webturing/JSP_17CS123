package lec11corejava.hp;


import java.math.BigInteger;

public class BigIntegerDemo2 {
    public static void main(String[] args) {
        System.out.println(1L*25000000000L*2500000000L);
        BigInteger a=new BigInteger("11111111999111111191");
        BigInteger b=new BigInteger("22222222222222222");
        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
        System.out.println(a.divide(b));
        System.out.println(a.mod(b));
        System.out.println(a.pow(2));
        System.out.println(a.gcd(b));
        System.out.println(a.toString(2));
        System.out.println(a.isProbablePrime(10));
    }
}
