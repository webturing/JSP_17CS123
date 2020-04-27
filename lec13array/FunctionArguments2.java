package lec13array;

import java.awt.*;

public class FunctionArguments2 {
    public static void main(String[] args) {
        Point p = new Point(3, 4);
        System.out.println(p);
        foo(p);//
        System.out.println(p);

    }

    static void foo(Point p) {//Point是引用类型   pass by reference
        ++p.x;


    }

}
