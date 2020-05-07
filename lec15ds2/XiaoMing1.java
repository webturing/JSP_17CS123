package lec15ds2;

import java.util.Arrays;

public class XiaoMing1 {
    public static void main(String[] args) {//n^2
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        int tot = 0;
        for (int j = 0; j < a.length - 1; j++) {//n
            Arrays.sort(a);//nlogn
            tot += a[j] + a[j + 1];
            a[j + 1] += a[j];
            a[j] = 0;
            System.out.println(Arrays.toString(a));
        }
        System.out.println(tot);
    }
}
