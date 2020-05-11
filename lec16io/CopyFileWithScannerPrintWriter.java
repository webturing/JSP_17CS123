package lec16io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CopyFileWithScannerPrintWriter {
    static Scanner cin = null;

    static {
        try {
            cin = new Scanner(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            cin = new Scanner(System.in);
        }
    }

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            System.out.println(a + b);
        }


    }
}
