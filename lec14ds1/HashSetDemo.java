package lec14ds1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> S=new HashSet<Integer>();
        for(int i=0;i<100;i++){
            S.add(i*i%1000);
            System.out.println(S);
        }

    }
}
