package com.companyname.heap;

import java.util.ArrayList;
import java.util.List;

public class PowerOfTwoMaxHeap {
    private List<Integer> heap;
    private int degree;

    public PowerOfTwoMaxHeap(int degreeParam) {
        this.degree = (int) Math.pow(2, degreeParam);
        this.heap = new ArrayList<>();
    }

    public void insert(int value) {
        heap.add(value);
        bubbleUp(heap.size() - 1);
    }

    public int popMax() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }

        int maxValue = heap.get(0);
        int lastValue = heap.remove(heap.size() - 1);

        if (!heap.isEmpty()) {
            heap.set(0, lastValue);
            bubbleDown(0);
        }

        return maxValue;
    }

    private void bubbleUp(int index) {
        int parentIndex = getParentIndex(index);
        while (index > 0 && heap.get(index) > heap.get(parentIndex)) {
            swap(index, parentIndex);
            index = parentIndex;
            parentIndex = getParentIndex(index);
        }
    }

    private void bubbleDown(int index) {
        while (true) {
            int maxIndex = index;
            int firstChildIndex = getFirstChildIndex(index);

            for (int i = 0; i < degree; i++) {
                int childIndex = firstChildIndex + i;
                if (childIndex < heap.size() && heap.get(childIndex) > heap.get(maxIndex)) {
                    maxIndex = childIndex;
                }
            }

            if (maxIndex != index) {
                swap(index, maxIndex);
                index = maxIndex;
            } else {
                break;
            }
        }
    }

    private int getParentIndex(int index) {
        return (index - 1) / degree;
    }

    private int getFirstChildIndex(int index) {
        return degree * index + 1;
    }

    private void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }
}
