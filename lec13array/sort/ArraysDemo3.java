package lec13array.sort;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo3 {
    public static void main(String[] args) {
        String[] words = "To know everything is   to know nothing".split("\\s+");
        System.out.println(Arrays.asList(words));
        //Arrays.sort(words);

        Arrays.sort(words, ArraysDemo3::compare);

        System.out.println(Arrays.asList(words));
    }

    private static int compare(String o1, String o2) {
        return o2.length() - o1.length();
    }
}
