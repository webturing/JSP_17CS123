package lec15ds2;

import java.util.PriorityQueue;

public class XiaoMing2 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6};
        int tot = 0;
        PriorityQueue<Integer>  Q=new PriorityQueue<>();
        for(int i=0;i<a.length;i++)Q.offer(a[i]);// nlogn

        while(Q.size()>1){//n*logn*3
            int x=Q.peek();
            Q.poll();
            int y=Q.peek();
            Q.poll();
            Q.offer(x+y);
            tot+=x+y;
        }

        System.out.println(tot);
    }
}
