package lec16io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CopyFile0 {
    public static void main(String[] args) {
        //copy file to StdOut

        try {
            FileInputStream  fis=new FileInputStream(new File("1.txt"));
            while(true){
                int x=fis.read();
                if(x==-1)break;//遇到了EOF End Of File
                System.out.print((char)x);//
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
