package contest1506;

public class A {
    public static void main(String[] args) {
        String s="abc123+xyz.5";
        System.out.println(s.replaceAll("[^a-zA-Z]+",""));
    }
}
