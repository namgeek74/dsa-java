package com.dsa;

import com.dsa.doublylinkedlist.DoublyLinkedList;
import com.dsa.linkedlist.LinkedList;
import com.dsa.queue.Queue;
import com.dsa.stack.Stack;
import com.dsa.tree.BinarySearchTree;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(5);
        binarySearchTree.insert(7);
        binarySearchTree.insert(12);
        binarySearchTree.insert(3);
        System.out.println(binarySearchTree.root.right.right.value);
        System.out.println(binarySearchTree.contains(12));
        System.out.println(binarySearchTree.contains(13));
        System.out.println(binarySearchTree.contains(3));

    }
}
