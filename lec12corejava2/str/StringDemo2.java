package lec12corejava2.str;

public class StringDemo2 {
    public static void main(String[] args) {
        String s = "we think we can.";
        String t = s.replaceAll("we", "you");
        System.out.println(t);
    }
}
