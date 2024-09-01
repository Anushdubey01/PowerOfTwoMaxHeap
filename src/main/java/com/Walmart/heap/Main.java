package com.companyname.heap;

public class Main {
    public static void main(String[] args) {
        PowerOfTwoMaxHeap heap = new PowerOfTwoMaxHeap(2);  // Quad heap (4 children per node)
        
        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
        heap.insert(15);
        heap.insert(30);
        heap.insert(25);

        System.out.println(heap.popMax()); // Should print 30
        System.out.println(heap.popMax()); // Should print 25
        System.out.println(heap.popMax()); // Should print 20
    }
}
