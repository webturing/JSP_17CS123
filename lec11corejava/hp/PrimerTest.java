package lec11corejava.hp;


import java.math.BigInteger;

public class PrimerTest {
    static BigInteger f(int n) {//2^2^n+1
        BigInteger two = new BigInteger("2");
        return two.pow(1 << n).add(BigInteger.ONE);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(
                    String.format("f(%d)=%s %s",i,f(i),
                    f(i).isProbablePrime(100))//4^(-100)=(0.25)^100
            );}
    }
}
