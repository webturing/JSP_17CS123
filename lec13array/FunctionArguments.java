package lec13array;

public class FunctionArguments {
    public static void main(String[] args) {
        int x = 3;
        foo(x);
        System.out.println(x);//3

    }

    static void foo(int x) {//int 是基础数据类型(7) 值传递 pass by value
        ++x;
    }

}
