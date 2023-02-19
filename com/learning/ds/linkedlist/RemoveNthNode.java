package com.learning.ds.linkedlist;

public class RemoveNthNode {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addAll(new String[]{"A", "B", "C", "D", "E"});
        list.printLinkedList();
        Node result = removeAt(3, list.head);
        while (result != null) {
            System.out.print(result.value + " --> ");
            result = result.next;
        }
    }

    public static Node removeAt(int position, Node head) {
        int counter = 0;
        Node current = head;
        while(counter < position-1) {
            current = current.next;
            counter++;
        }
        Node next = current.next.next;
        current.next = next;
        return head;
    }
}
