package lec15ds2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class PrimerCycle {
    public static void main(String[] args) {
        List<Integer> a = new Vector(Arrays.asList(1, 2, 3, 4));
        while (true) {
            Collections.shuffle(a);
            boolean ok = true;
            for (int i = 0; i < a.size(); i++) {
                if (!primer(a.get(i) + a.get((i + 1) % a.size()))) {
                    ok = false;
                }

            }


            if (ok) {
                System.out.println(a);
                break;
            }
        }

    }

    private static boolean primer(int n) {
        return n == 2 || n == 3 || n == 5 || n == 7 || n == 11;
    }
}
