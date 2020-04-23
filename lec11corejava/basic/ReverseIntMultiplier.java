package lec11corejava.basic;

public class ReverseIntMultiplier {
    final String EXIT_ON_CLICK = "111";

    public static void main(String[] args) {
        int k = sumXY(3, 4);

        int x = 12345699;


        System.out.println(r(x));
    }

    private static int sumXY(int x, int y) {
        //TODO
        return 0;
    }

    private static int r(int x) {//API型

        return Integer.parseInt(new StringBuffer(Integer.toString(x)).reverse().toString());

    }

    private static int r2(int x) {//API型
        String s = Integer.toString(x);
        StringBuffer buffer = new StringBuffer(s);
        buffer.reverse();
        String t = buffer.toString();
        int y = Integer.parseInt(t);
        return y;
    }

    private static int r1(int x) {//算法型
        int s = 0;
        while (x > 0) {
            int d = x % 10;
            s = s * 10 + d;
            x /= 10;
        }
        return s;
    }


}