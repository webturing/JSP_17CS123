package lec16io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileWithFISFOS {
    public static void main(String[] args) {
        //copy file

        try {
            FileInputStream fis = new FileInputStream(new File("calc.exe"));
            FileOutputStream fos = new FileOutputStream(new File("calc2.exe"));
            int x;
            while ((x = fis.read()) != -1) {
                fos.write(x);//
            }
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
