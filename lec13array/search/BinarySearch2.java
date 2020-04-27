package lec13array.search;

import java.util.Arrays;

public class BinarySearch2 {
    //二分查找特点
    // 1. 待搜索的数组有序（默认为升序)
    // 2. 查找不到返回负数
    //3. 如果找到只能保证a[pos]=k,不能保证pos是最小或者最大
    public static void main(String[] args) {
        Integer[] a = new Integer[]{1, 3, 4, 67, 67, 67, 67, 8, 678, 6, 78,};
        Arrays.sort(a,(x,y)->(y-x));
        System.out.println(Arrays.toString(a));
        int k = 67;
        // int pos = binarySearch2(a, k);
        int pos = Arrays.binarySearch(a, k,(x,y)->(y-x));
        while(a[pos-1]==k){
            --pos;
        }
        if (pos < 0) {
            System.out.println("NOT FOUND!");
        } else {
            System.out.println(pos);
        }

    }

}
