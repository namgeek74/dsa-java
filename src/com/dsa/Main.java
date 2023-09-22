package com.dsa;

import com.dsa.doublylinkedlist.DoublyLinkedList;
import com.dsa.hash.HashTable;
import com.dsa.linkedlist.LinkedList;
import com.dsa.queue.Queue;
import com.dsa.stack.Stack;
import com.dsa.tree.BinarySearchTree;

public class Main {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.set("nails", 100);
        hashTable.set("tile", 50);
        hashTable.set("lumber", 80);
        hashTable.set("bolts", 200);
        hashTable.set("screws", 140);

        hashTable.printTable();
        System.out.println(hashTable.get("bolts"));
        System.out.println(hashTable.get("boltsf"));
        System.out.println(hashTable.get("lumber"));
        System.out.println(hashTable.keys());


    }
}
