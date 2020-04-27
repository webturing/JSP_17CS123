package lec13array;

import java.awt.*;
import java.util.Arrays;

public class FunctionArguments3 {
    public static void main(String[] args) {
       int[] a={1,2,3};
       foo(a);
        System.out.println(Arrays.toString(a));
    }

    static void foo(int[] a) {//Point是引用类型   pass by reference
        ++a[0];


    }

}
