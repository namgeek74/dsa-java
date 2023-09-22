package com.dsa;

import com.dsa.doublylinkedlist.DoublyLinkedList;
import com.dsa.graph.Graph;
import com.dsa.hash.HashTable;
import com.dsa.linkedlist.LinkedList;
import com.dsa.queue.Queue;
import com.dsa.stack.Stack;
import com.dsa.tree.BinarySearchTree;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("C", "B");

        graph.removeVertex("B");

        graph.printGraph();


    }
}
