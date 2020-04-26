package lec12corejava2.str;

import java.util.Arrays;


public class Expression {
    public static void main(String[] args) {
        String exp = "1      +   2 - 3 * 5554 / 15 ";
        System.out.println(Arrays.toString(exp.split("\\s+")));//tokens
        System.out.println(Arrays.toString(exp.split("\\D+")));//numbers
        System.out.println(Arrays.toString(exp.split("\\s*\\d+\\s*")));//operators
    }
}
