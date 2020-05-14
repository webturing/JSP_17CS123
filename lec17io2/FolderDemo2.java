package lec17io2;

import java.io.File;

public class FolderDemo2 {
    public static void main(String[] args) {
        File file=new File("demo");
        System.out.println(file.isDirectory());
       // file.delete();//file.delete只能删除文件或者空目录
        if(file.isDirectory()) {
            String[] files = file.list();//list方法只能用于目录，列出该目录的所有下一级文件/含目录

            for (String ff : files) {
                System.out.println(new File(file,ff).getAbsolutePath());
            }
        }
    }
}
