package lec13array.search;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[1024+1];//
        for (int i = 0; i < a.length; i++) {
            a[i] = i * i * i;
        }

        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int k = cin.nextInt();
            int pos = Arrays.binarySearch(a, Math.abs(k));
            if (pos < 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

    }
}
