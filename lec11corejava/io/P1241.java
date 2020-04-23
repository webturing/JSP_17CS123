package lec11corejava.io;

import java.util.Scanner;

public class P1241 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            if (n == 0) {
                break;
            }
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = cin.nextInt();
            }
            int tot = 0;
            for (int i = 0; i < arr.length; i++) {
                tot += arr[i];
            }
            System.out.println(tot);
        }
        cin.close();
    }
}
