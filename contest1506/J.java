package contest1506;

public class J {
    static final String HEX = "0123456789ABCDEF";
    static final String BIN = "0000000100100011010001010110011110001001101010111100110111101111";

    public static void main(String[] args) {
        //    genHex();

        String hex="ABC010";
        for(char ch:hex.toCharArray()){
            int idx = HEX.indexOf(ch);
           // System.out.println(idx);
            if (idx < 0) {
                System.out.println("NOT FOUND");
            } else {
                System.out.print(BIN.substring(idx*4,idx*4+4));
            }
        }
    }

    private static void genHex() {
        for (int i = 0; i < 16; i++) {
            String b = "";
            b += (i >> 3) & 1;
            b += (i >> 2) & 1;
            b += (i >> 1) & 1;
            b += (i >> 0) & 1;
            System.out.print(b);
        }
    }
}
