package com.dsa;

import com.dsa.doublylinkedlist.DoublyLinkedList;
import com.dsa.graph.Graph;
import com.dsa.hash.HashTable;
import com.dsa.heap.Heap;
import com.dsa.linkedlist.LinkedList;
import com.dsa.queue.Queue;
import com.dsa.stack.Stack;
import com.dsa.tree.BinarySearchTree;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.rInsert(2);
        binarySearchTree.rInsert(1);
        binarySearchTree.rInsert(3);
        binarySearchTree.rInsert(31);
        binarySearchTree.rInsert(13);
        binarySearchTree.rInsert(23);
        binarySearchTree.rInsert(14);
        binarySearchTree.rInsert(4);


        System.out.println(binarySearchTree.DFSInOrder());
        System.out.println(binarySearchTree.root.right.right.left.right.left.value);
    }
}
