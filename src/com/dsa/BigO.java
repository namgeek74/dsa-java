package com.dsa;

// BigO is worst case
// Drop constants
// Drop non-dominants
public class BigO {

    // BigO = O(n)
    public static void bigOn(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    // BigO = O(n^2)
    public static void bigOn2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
    }

    // BigO = O(1)
    public static void bigO1(int n) {
        System.out.println(n);
    }

    // BigO = O(log n)
    // log of 2
    // Binary Search
}
