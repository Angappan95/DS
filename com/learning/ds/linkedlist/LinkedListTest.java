package com.learning.ds.linkedlist;

class Node {
    String value;
    Node next;

    public Node(String value) {
        this.value = value;
    }
}

class LinkedList {
    Node head;
    Node tail;
    int size;

    public void push(String val) {
        Node node = new Node(val);
        if (this.size == 0) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }
        this.size++;
    }

    public void addAll(String[] values) {
        for (String value : values) {
            this.push(value);
        }
    }

    public Node get(int index) {
        if (this.size < 0 || index >= this.size || index < 0) {
            return null;
        }
        if (index == 0) {
            return this.head;
        }
        int counter = 1;
        Node curr = this.head;
        while (counter <= index) {
            curr = curr.next;
            counter++;
        }
        return curr;
    }

    public Node pop() {
        if (this.size == 0) {
            return null;
        }
        if (this.size == 1) {
            Node temp = this.head;
            this.size--;
            return temp;
        } else {
            Node curr = this.head;
            while (curr.next.next != null) {
                curr = curr.next;
            }
            this.tail = curr;
            this.tail.next = null;
            this.size--;
            return curr;
        }
    }

    public int getSize() {
        return this.size;
    }

    public int set(int index, String value) {
        int counter = 0;
        Node node = new Node(value);
        Node curr = this.head;

        if (index < 0 || index >= this.size) {
            return -1;
        } else {
            while (counter < index - 1) {
                curr = curr.next;
                counter++;
            }
            Node temp = curr.next;
            curr.next = node;
            curr.next.next = temp;
        }
        return 1;
    }

    // returns position
    public int search(String value) {
        if (this.size < 1) {
            return -1;
        }

        int counter = 0;
        Node temp = this.head;
        while (counter < this.size) {
            if (temp.value == value) {
                return counter;
            } else {
                temp = temp.next;
            }
            counter++;
        }
        return -1;
    }

    public void printLinkedList() {
        Node curr = this.head;
        while (curr != null) {
            System.out.print(curr.value + " --> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

}

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//      Test linkedlist push
//        list.push("1000");
//        list.push("1001");
//        list.push("1002");
//        list.push("1003");
//        list.push("1004");
//        list.printLinkedList();

//        Test Linkedlist addAll
        list.addAll(new String[]{"1000", "1001", "1002", "1003", "1004"});
        list.printLinkedList();

//      Test linkedlist get
//        System.out.println(list.get(1).value);
//        System.out.println(list.get(4).value);
//        System.out.println(list.get(0).value);
//        System.out.println(list.get(-1));

//      Test linkedlist pop
//        list.pop();
//        list.printLinkedList();
//        list.pop();
//        list.pop();
//        list.printLinkedList();

//      Test linkedlist set
//        list.set(1, "1");
//        list.printLinkedList();
//        list.set(2, "2");
//        list.printLinkedList();

//      Test linkedlist search
        System.out.println(list.search("1003"));
    }
}
