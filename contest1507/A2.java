package contest1507;


import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class A2 {
    public static void main(String[] args) {
        int n = cin.nextInt();
        Vector<Integer> v = new Vector<>();
        while (n-- > 0) {
            int x = cin.nextInt();
            if (v.contains(x)) continue;
            v.add(x);
        }
        Collections.sort(v);
        for (Integer i : v) {
            System.out.println(i);
        }
        cin.close();
        cout.close();

    }

    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);
}
