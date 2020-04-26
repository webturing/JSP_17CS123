package lec12corejava2.str;

public class StringDemo {
    static void step0() {
        String s = "";
        for (int i = 1; i < 100000; i++)
            s += i;
        System.out.println(s.charAt(1000));
    }

    static void step1() {
        char[] s = new char[7 * 1000000 + 10];
        int j = 0;
        for (int i = 1; i <= 1000000; i++) {
            int k = i;
            while (k > 0) {
                s[j++] = (char) (k % 10 + '0');
                k /= 10;
            }
        }
        //   System.out.println(s);
        System.out.println(s[1000]);
    }

    static void step2() {
        StringBuffer buffer = new StringBuffer();//可变字符串，性能接近数组，但是方便操作 reverse
        for (int i = 1; i <= 1000000; i++) {
            buffer.append(i);
        }
        System.out.println(buffer.charAt(1000));
    }

    public static void main(String[] args) {

    }
}
