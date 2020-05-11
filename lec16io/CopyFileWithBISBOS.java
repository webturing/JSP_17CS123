package lec16io;

import java.io.*;

public class CopyFileWithBISBOS {
    public static void main(String[] args) {
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("1.txt")));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("4.txt")));
            int x;
            while ((x = bis.read()) != -1) {
                bos.write(x);
            }
            bis.close();
            bos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
