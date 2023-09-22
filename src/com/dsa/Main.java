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
        // Heap heap = new Heap();
        // heap.insert(99);
        // heap.insert(72);
        // heap.insert(100);
        // heap.remove();
        // System.out.println(heap.getHeap());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(99);
        priorityQueue.add(72);
        priorityQueue.add(100);
        priorityQueue.add(5);
        priorityQueue.add(15);

        System.out.println(priorityQueue);
        priorityQueue.remove();
        System.out.println(priorityQueue);
        Comparator<Integer> maxHeapComparator = Comparator.reverseOrder();
        PriorityQueue<Integer> maxPriorityQueue = new PriorityQueue<>(maxHeapComparator);
        maxPriorityQueue.add(99);
        maxPriorityQueue.add(72);
        maxPriorityQueue.add(100);
        maxPriorityQueue.add(5);
        maxPriorityQueue.add(15);

        System.out.println(maxPriorityQueue);
    }
}
