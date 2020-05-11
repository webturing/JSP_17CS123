package lec16io;

import java.io.IOException;

public class IODemo1 {
    public static void main(String[] args) {
        try {
            int x=System.in.read();//'3' => 51  EOF => -1
            int y=System.in.read();
           int t=(x-'0')*10+(y-'0');
            System.out.println(t);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
