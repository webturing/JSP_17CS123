package lec17io2;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        //  File f=new File("demo\\sub1\\a");//only in windows
        File f = new File("demo/sub1/a");//good
        System.out.println(f.exists());
        System.out.println(f.isDirectory());
        System.out.println(f.length());//
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
    }
}
