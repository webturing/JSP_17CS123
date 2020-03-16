import java.util.Scanner;

public class App0 {
    //coding like C
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.next();
        boolean flag = true;
        int n = str.length();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "Y" : "N");
        cin.close();

    }
}
