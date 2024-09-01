package com.companyname.heap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PowerOfTwoMaxHeapTest {

    @Test
    void testInsertAndPopMax() {
        PowerOfTwoMaxHeap heap = new PowerOfTwoMaxHeap(1);  // Binary Heap
        heap.insert(10);
        heap.insert(20);
        heap.insert(5);

        assertEquals(20, heap.popMax());
        assertEquals(10, heap.popMax());
        assertEquals(5, heap.popMax());
    }

    @Test
    void testQuadHeapInsertAndPopMax() {
        PowerOfTwoMaxHeap heap = new PowerOfTwoMaxHeap(2);  // Quad Heap
        heap.insert(30);
        heap.insert(15);
        heap.insert(20);
        heap.insert(25);

        assertEquals(30, heap.popMax());
        assertEquals(25, heap.popMax());
        assertEquals(20, heap.popMax());
        assertEquals(15, heap.popMax());
    }

    @Test
    void testEmptyHeapPopMax() {
        PowerOfTwoMaxHeap heap = new PowerOfTwoMaxHeap(1);
        assertThrows(IllegalStateException.class, heap::popMax);
    }
}
