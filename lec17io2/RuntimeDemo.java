package lec17io2;

import java.io.IOException;

public class RuntimeDemo {
    public static void main(String[] args) {
        try {
            Runtime.getRuntime().exec("mspaint");
            Runtime.getRuntime().exec("explorer.exe https://acm.webturing.com");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
