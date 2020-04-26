package lec12corejava2.str;

public class CharacterDemo {
    //Unicode \u0000-\uffff  65536
    //0~255 ASCII \u0076
    public static void main(String[] args) {
        for (char c = '0'; c <= '9'; c++) {
            System.out.print(c);
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c);
        }
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c);
        }
        System.out.println();
        for (int i = 0; i < (1 << 8); i++) {
            System.out.print((char) (i));
        }
        System.out.println();
        for (int i = 0; i < (1 << 16); i++) {
            System.out.print((char) (i));
            if (i % 256 == 0)
                System.out.println();
        }
    }
}
