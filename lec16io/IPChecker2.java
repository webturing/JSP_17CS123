package lec16io;

import java.util.Scanner;

public class IPChecker2 {
    public static void main(String[] args) {
       //String s = "a.b.c.d";
       // String[] arr = s.split("\\.");
        //System.out.println(Arrays.asList(arr));
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()) {
            System.out.println(check(cin.nextLine())?"Y":"N");
        }

    }

    private static boolean check(String s) {
        String[] arr = s.split("\\.");
        if (arr.length != 4) return false;
        try {
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);
            int d = Integer.parseInt(arr[3]);
            return 0 <= a && a <= 255
                    && 0 <= b && b <= 255
                    && 0 <= c && c <= 255
                    && 0 <= d && d <= 255;
        } catch (Exception e) {
            return false;
        }

    }


}
