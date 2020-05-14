package lec17io2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileCountLines {
    public static void main(String[] args) {
        String fileName = "demo/test.txt";
        int tot = countLinesFromFile(fileName);

        System.out.println(tot + " lines");

    }

    public static int countLinesFromFile(String fileName) {
        int tot = 0;
        try {
            Scanner cin = new Scanner(new File(fileName));
            while (cin.hasNextLine()) {
                String line = cin.nextLine();
                if (line.trim().isEmpty()) continue;//跳过文件中的空白行
                ++tot;
            }

        } catch (IOException e) {
            System.err.println("文件打开异常");
            e.printStackTrace();

        }
        return tot;
    }
}
