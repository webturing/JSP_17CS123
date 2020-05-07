package lec15ds2;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {//heap
        PriorityQueue<Integer> Q=new PriorityQueue<>();
        for(int i=0;i<10;i++){
            int x=(int)(Math.random()*100);
            System.out.println("x="+x+" will push into pq");
            Q.offer(x);//push
            System.out.println(Q);
        }
        while(!Q.isEmpty()){
            System.out.println(Q.peek());
            Q.poll();//remove top of heap
        }
    }
}
