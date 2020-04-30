package lec14ds1;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> S=new TreeSet<Integer>();
        for(int i=0;i<100;i++){
            S.add(i*i%10);
            System.out.println(S);
        }

    }
}
