package contest1506;

public class I {
    public static void main(String[] args) {
        String s = "I want an ACCEPTED.";
        StringBuffer buffer = new StringBuffer(s);
        for (int i = 0; i < buffer.length(); i++) {
            char ch = buffer.charAt(i);
            if (Character.isUpperCase(ch)) {
                ch = Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                ch = Character.toUpperCase(ch);
            }
            buffer.setCharAt(i, ch);
        }
        System.out.println(buffer);
    }
}
