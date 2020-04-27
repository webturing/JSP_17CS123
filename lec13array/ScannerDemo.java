package lec13array;

import java.math.BigInteger;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        BigInteger a = cin.nextBigInteger();
        BigInteger b = cin.nextBigInteger();
        System.out.println(a.add(b));
        cin.close();
    }
}
