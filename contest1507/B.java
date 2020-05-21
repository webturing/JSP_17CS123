package contest1507;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class B {
    public static void main(String[] args) {
         String [] words=cin.nextLine().split("\\W+");
       // String[] words = "  To know everything? is to    know nothing.  ".toLowerCase().trim().split("\\W+");
        //System.out.println(Arrays.asList(words));
        System.out.println(words.length);
        Map<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                int old = map.get(word);
                map.put(word, old + 1);
            } else {
                map.put(word, 1);
            }
        }
        //System.out.println(map);
        for (String k : map.keySet()) {
            System.out.println(k + ":" + map.get(k));
        }

    }

    static Scanner cin = new Scanner(System.in);

}
