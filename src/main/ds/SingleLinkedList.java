package main.ds;

/**
 * @author Rajanish
 * @date 3-Nov-2020
 */
public class SingleLinkedList {

    public static class Node {

        public Node next;

        public int val;

        public Node(int val) {
            this.next = null;
            this.val = val;
        }
    }

    public static Node head = null;

    public static void append(int val) {
        Node newNode = new Node(val);
        Node itr = head;
        while (itr.next != null) {
            itr = itr.next;
        }
        itr.next = newNode;
    }

    public static void insert(int val) {
        Node newNode = new Node(val);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
    }

    public static void insertAt(int idx, int val) {
        if (idx == 0) {
            insert(val);
        }
        Node newNode = new Node(val);
        Node itr = head;
        while (idx > 1) {
            itr = itr.next;
            idx--;
        }
        newNode.next = itr.next;
        itr.next = newNode;
    }

    public static void deleteFirst() {
        head = head.next;
    }

    public static void deleteLast() {
        Node itr = head;
        while (itr.next.next != null) {
            itr = itr.next;
        }
        itr.next = null;
    }

    public static void deleteAt(int idx) {
        if (idx == 1) {
            deleteFirst();
        } else {
            Node itr = head;
            while (idx > 2) {
                itr = itr.next;
                idx--;
            }
            itr.next = itr.next.next;
        }
    }

    public static void print() {
        Node temp = head;
        if (temp == null) return;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        insert(4);
        insert(2);
        insert(12);
        insert(8);
        print();
        insertAt(2, 5);
        insertAt(2, 7);
        insertAt(4, 11);
        print();
        append(15);
        append(17);
        print();
        deleteFirst();
        deleteFirst();
        print();
        deleteLast();
        deleteLast();
        print();
        deleteAt(3);
        print();
        deleteAt(2);
        print();
        deleteAt(1);
        print();
    }

}
