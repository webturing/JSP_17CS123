package contest1506;

import java.util.Arrays;
import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        int[] freq = new int[26];
        System.out.println(Arrays.toString(freq));
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextLine()) {
            char[] chs = cin.nextLine().toLowerCase().toCharArray();
            for (char ch : chs) {
                if (Character.isLetter(ch)) {
                    freq[ch - 'a']++;
                }
            }
        }
        System.out.println(Arrays.toString(freq));
    }
}
