package contest1507;


import java.io.PrintWriter;
import java.util.*;

public class A3 {
    public static void main(String[] args) {
        int n = cin.nextInt();
        Set<Integer> v = new TreeSet<>();
        while (n-- > 0) {
            int x = cin.nextInt();
            v.add(x);
        }
        for (Integer i : v) {
            cout.println(i);
        }
        cin.close();
        cout.close();

    }

    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);
}
