package lec01;

import java.util.Scanner;

public class App1 {
    //coding like Java
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.next();
        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        String str2 = buffer.toString();

        System.out.println(str.equals(str2) ? "Y" : "N");
        cin.close();

    }
}
