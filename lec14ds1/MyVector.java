package lec14ds1;

import java.util.Arrays;

public class MyVector {
    int capacity = 1;
    int[] data = new int[capacity];
    int size = 0;

    MyVector() {

    }

    public static void main(String[] args) {

        MyVector v = new MyVector();//[]
        for (int i = 0; i < 1000000; i++) {
            v.add(i);
            //v.print();
        }


    }

    private void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    private void add(int ele) {//O(1)
        if (size == capacity) {
            System.err.println("double capacity~~~");
            capacity *= 2;
            int[] data2 = new int[capacity];
            for (int i = 0; i < size; i++) {
                data2[i] = data[i];
            }
            data = data2;
        }
        data[size++] = ele;
    }
}
