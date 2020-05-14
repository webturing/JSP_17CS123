package lec17io2;

import java.io.File;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class CrawlerDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.ahstu.edu.cn/info/1014/24493.htm");
            Scanner cin = new Scanner(url.openStream());
            PrintWriter cout = new PrintWriter(new File("ahstu.html"));
            while (cin.hasNextLine()) {
                String line = cin.nextLine();
                System.err.println(line);
                cout.println(line);
            }
            cin.close();
            cout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
