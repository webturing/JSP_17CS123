package lec12corejava2.str;

public class CharacterDemo2 {
//Character 静态类 判断字符区间（种类），字符大小写转化
    public static void main(String[] args) {
        String s = "ajksdfjkl127378912789%^&*DFHJKHHJKSFHJKJHK";
        int letters, digits, other;
        letters = digits = other = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) ++letters;
            else if (Character.isDigit(ch)) ++digits;
            else ++other;
        }
        System.out.println(String.format("%d %d %d", letters, digits, other));
    }
}
