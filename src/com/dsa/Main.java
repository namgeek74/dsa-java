package com.dsa;

import com.dsa.doublylinkedlist.DoublyLinkedList;
import com.dsa.linkedlist.LinkedList;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.prepend(0);
        doublyLinkedList.insert(1, 10);
        doublyLinkedList.append(3);
        doublyLinkedList.remove(3);
        doublyLinkedList.printList();
    }
}
