package lec16io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Date;

public class ExceptionDemo {
    public static void main(String[] args) throws Exception {
        //  System.out.println(1/0);//java.lang.ArithmeticException
        int a[] = new int[3];
        // a[10]++;//java.lang.ArrayIndexOutOfBoundsException
        System.out.println(Integer.parseInt("12341237812737812378"));//java.lang.NumberFormatException
        Date date = null;
        //   System.out.println(date.getTime());//java.lang.NullPointerException
        File file = new File("f:\\1.txt");
//        try {
//            BufferedReader br= new BufferedReader(new FileReader(file));//java.io.FileNotFoundException
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        BufferedReader br = new BufferedReader(new FileReader(file));//java.io.FileNotFoundException

    }
}
