package lec17io2;

import java.io.IOException;

public class RuntimeDemo2 {
    public static void main(String[] args) throws IOException {
        for(int i=0;i<10;i++){
            Runtime.getRuntime().exec("explorer http://www.ahstu.edu.cn/info/1014/24493.htm");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
