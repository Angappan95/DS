package com.learning.ds.linkedlist;

public class ReverseLinkedList {
    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        while(current != null){
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addAll(new String[]{"A", "B", "C", "D"});
        list.printLinkedList();

        Node result = reverse(list.head);
        while (result != null) {
            System.out.print(result.value + " --> ");
            result = result.next;
        }
    }
}
