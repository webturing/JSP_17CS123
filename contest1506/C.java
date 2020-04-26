package contest1506;

public class C {
    public static void main(String[] args) {
        String s = "abcba";
        String t = new StringBuffer(s).reverse().toString();
        // 对象类型 （引用类型） a==b 表示a,b拥有相同的hash地址，
        //对象值相同 需要重载 调用 a.equals(b)来判断
        //null.equals(a)
        if (s.equals(t)) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
    }
}
