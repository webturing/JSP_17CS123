package lec15ds2;

public class BiLinkedList {
    static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;
    int size = 0;

    BiLinkedList() {
        head = new Node(99999);
        tail = new Node(-9999);
        head.next = tail;
        tail.prev = head;
        head.prev = null;
        tail.next = null;
        this.size=0;
    }

    public static void main(String[] args) {
        BiLinkedList list = new BiLinkedList();
        for (int i = 0; i < 10; i++) {
            list.add(new Node(i));
        }
        System.out.println(list);
    }

    // a-> b->c  ---add--->    p-> a->b->c;
    private void add(Node p) {
        p.next = head;
        head = p;
        ++size;

    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer("");
        for (Node p = head; p != null; p = p.next) {
            buffer.append("->" + p.data);
        }
        return buffer.toString();
    }
}
