package lec14ds1;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> contacts = new TreeMap<>();//create
        contacts.put("Tom", "13612345678");//insert
        contacts.put("Jerry", "13800001111");//insert
        System.out.println("Calling ...."+contacts.get("Tom"));//query
        System.out.println("keySet():"+contacts.keySet());
        System.out.println(contacts.size());
        System.out.println(contacts.values());
        contacts.put("Tom","13888888888");//update
        contacts.remove("Jerry");
        System.out.println(contacts);



    }
}
