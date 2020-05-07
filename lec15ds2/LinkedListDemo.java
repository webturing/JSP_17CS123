package lec15ds2;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        for(int i=0;i<10;i++){//low
            System.out.println(list.get(i));
        }
        //good
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }
        //best 迭代器模式
        for(Integer i:list){
            System.out.println(i);
        }
    }
}
