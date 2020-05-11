package lec16io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileWithFIS {
    public static void main(String[] args) {
        //copy file to StdOut

        try {
            FileInputStream fis = new FileInputStream(new File("1.txt"));
            int x;
            while ((x = fis.read()) != -1) {
                System.out.print((char) x);//
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
