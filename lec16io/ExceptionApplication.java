package lec16io;

public class ExceptionApplication {
    public static void main(String[] args) {
        String s="+1.3E+7";
        //数字类型种类： 123 +123 -123 12.3 +12.3 -12.3 +12. +.3 -.3   +1.3E+7
        System.out.println(isNumberPoor(s));
        System.out.println(isNumberBetter(s));
    }

    private static boolean isNumberBetter(String s) {
        try {
            double x = Double.parseDouble(s);
            return true;
        }catch (Exception e){
            return false;
        }

    }

    private static boolean isNumberPoor(String s) {
       return  s.matches("\\d+.\\d+");
    }
}
