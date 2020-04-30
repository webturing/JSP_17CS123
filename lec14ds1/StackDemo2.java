package lec14ds1;

import java.util.Stack;

public class StackDemo2 {
    public static void main(String[] args) {
        //6 (10)=> 110(2)
        int n = 1023;

        Stack<Integer> S = new Stack<Integer>();
        do {
            S.push(n % 2);
            n /= 2;
        } while (n > 0);

        while (!S.empty()) {
            System.out.print(S.peek());
            S.pop();
        }
    }
}
