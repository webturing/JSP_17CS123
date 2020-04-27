package lec13array;

public class FunctionOverrideDemo {
    public static void main(String[] args) {
        int x = add(3, 4);
        double y = add(3.0, 4.0);
        float f = add(3.0f, 4.0f);
    }

    static int add(int a, int b) {
        return 0;
    }

    static double add(double v, double v1) {
        return 0.0;
    }

    static float add(float v, float v1) {
        return 0.0f;
    }
    static Object add(Object a,Object b){// BigInteger String
        return null;
    }
}
