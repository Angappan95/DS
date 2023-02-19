package com.learning.ds.queue;

class Queue {
    private int[] arr = new int[10];
    private int pointer;

    public void enqueue(int value) {
        arr[pointer++] = value;
    }

    public int dequeue() {
        int i = 0;
        while (i < pointer) {
            arr[i] = arr[i + 1];
            i++;
        }
        pointer--;
        return arr[0];
    }

    public void printQueue() {
        int i = 0;
        while (i < pointer) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }

}

public class TestQueue {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.enqueue(1001);
        q1.enqueue(1002);
        q1.enqueue(1003);
        q1.printQueue();
        q1.dequeue();
        q1.printQueue();
        q1.enqueue(1004);
        q1.enqueue(1005);
        q1.printQueue();
        q1.dequeue();
        q1.printQueue();
    }
}
