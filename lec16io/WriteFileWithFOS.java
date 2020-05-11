package lec16io;

import java.io.*;

public class WriteFileWithFOS {
    public static void main(String[] args) {
        //write File

        try {
            FileOutputStream fos=new FileOutputStream(new File(new File("d:"),"2.txt"));
            fos.write(53);
            fos.write(54);
            fos.write('A');
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
