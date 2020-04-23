package lec11corejava.io;

import java.util.Scanner;

public class P1243 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        while (T-- > 0) {
            int n = cin.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = cin.nextInt();

            }
            int tot = 0;
            for (int i : arr) {//for each 简洁 只读 顺序(不一定按索引)访问集合(数组、链表、二叉树，堆)
                tot += i;
            }
            System.out.println(tot);
        }
        cin.close();
    }
}
