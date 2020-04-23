package lec11corejava.basic;

public class StringBufferDemo {
    public static void main(String[] args) {
        int n = 123456;
        String s = Integer.toString(n);//int=>String
        String s2 = Integer.toString(n, 12);
//        String t = "";
//        for (int i = s.length() - 1; i >= 0; i--) {
//            t = t + s.charAt(i);
//        }
        StringBuffer buffer = new StringBuffer(s);//String=>StringBuffer
        buffer.reverse();//reverse
        String t = buffer.toString();//StringBuffer->String
        int m = Integer.parseInt(t);//String=>Integer
        int y=Integer.parseInt(t,16);//
        System.out.println(m);
    }
}
