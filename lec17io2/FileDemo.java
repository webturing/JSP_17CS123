package lec17io2;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
      //  File file =new File("d:\\test");
        File parent=new File("demo");
        parent.mkdir();
        File file=new File(parent, "sub1");
        file.mkdir();
    }
}
