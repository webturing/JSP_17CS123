package lec13array;

public class FunctionOverrideDemo2 {
    public static void main(String[] args) {
        System.out.println(add(3,4,5));
        System.out.println(add(3,4));
        System.out.println(add(3));
    }

    static int add(int a,int b,int c){
        return a+b+c;
    }
    static int add(int a,int b){
        return add(a,b,0);
    }
    static int add(int a){
        return add(a,0);
    }
}
