package contest1507;


import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        int n = cin.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = cin.nextInt();

        }
        Arrays.sort(a);

        int[] b = new int[n];
        int j = 0;
        b[j++] = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] != b[j - 1]) {
                b[j++] = a[i];
            }
        }
        for (int i = 0; i < j; i++) {
            cout.println(b[i]);
        }

        cin.close();
        cout.close();

    }

    static Scanner cin = new Scanner(System.in);
    static PrintWriter cout = new PrintWriter(System.out);
}
