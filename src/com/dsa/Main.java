package com.dsa;

import com.dsa.doublylinkedlist.DoublyLinkedList;
import com.dsa.linkedlist.LinkedList;
import com.dsa.queue.Queue;
import com.dsa.stack.Stack;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();

        queue.printQueue();
    }
}
