package com.dsa;

import com.dsa.doublylinkedlist.DoublyLinkedList;
import com.dsa.graph.Graph;
import com.dsa.hash.HashTable;
import com.dsa.heap.Heap;
import com.dsa.linkedlist.LinkedList;
import com.dsa.queue.Queue;
import com.dsa.stack.Stack;
import com.dsa.tree.BinarySearchTree;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8};
        int[] arr2 = {3, 5, 7, 9};

        System.out.println(Arrays.toString(SortAlgorithm.merge(arr, arr2)));
    }
}
