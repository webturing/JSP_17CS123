package lec16io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class CopyFile1 {
    public static void main(String[] args) {
        //copy file to StdOut

        try {
            FileReader fis = new FileReader(new File("1.txt"));
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
