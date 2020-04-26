package lec12corejava2.str;

import java.util.Arrays;

public class IPChecker {
    public static void main(String[] args) {
        String s = "55 . 555 .   1 . 1";
        boolean flag = check(s);
        System.out.println(flag);
    }

    private static boolean check(String s) {
        String[] ip = s.split("\\s*\\.\\s*");
        if (ip.length != 4) return false;
        for (int i = 0; i < ip.length; i++) {
            if (!ip[i].matches("\\d+")) return false;
            int k = Integer.parseInt(ip[i]);
            if (k > 255 || k < 0) return false;
        }
        return true;
    }
}
