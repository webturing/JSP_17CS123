package lec15ds2;

public class QueueDemo {
    static class Queue {
        //data[head,tail)
        static final int N = 10;
        int[] data = new int[N];
        int head = 0;
        int tail = 0;
        int size = 0;

        void push(int x) {
            data[tail] = x;
            tail = (tail + 1) % N;
            ++size;
        }

        void pop() {
            head = (head + 1) % N;
            --size;
        }

        int front() {
            return data[head];
        }

        void print() {
            for (int i = head; i != tail; i = (i + 1) % N) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }

        boolean empty() {
            return size==0;
        }

    }

    public static void main(String[] args) {
        Queue Q = new Queue();
        for (int i = 0; i < 15; i++) {
            Q.push(i);

            if(i%2==0)
                Q.pop();
            Q.print();
        }

    }
}
