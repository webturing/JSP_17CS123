package contest1506;

import java.util.Arrays;

public class G {
    public static void main(String[] args) {
        String s = "xxxxxx";
        char[] chs = s.toCharArray();
        Arrays.sort(chs);
        char maxChar = chs[chs.length - 1];
        System.out.println(s.replaceAll(maxChar + "", maxChar + "(max)"));
    }
}
