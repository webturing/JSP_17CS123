package lec15ds2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class CollectionsDemo {
    //Algorithm  Math Arrays Collections
    public static void main(String[] args) {
        List<Integer>  a=new Vector<Integer>(Arrays.asList(11,2,3,4,5));
        System.out.println(a);
        System.out.println(Collections.max(a));
        System.out.println(Collections.min(a));
        Collections.sort(a);
        System.out.println(a);
        Collections.shuffle(a);
        System.out.println(a);
        int key=4;
        System.out.println(Collections.binarySearch(a,key));
    }
}
