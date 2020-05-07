package lec15ds2;

public class UniLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    int size = 0;

    UniLinkedList() {

    }

    public static void main(String[] args) {
        UniLinkedList list = new UniLinkedList();
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
