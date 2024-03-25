package model;

import java.util.Arrays;

public class IntArray {
    private final int DEFAULT_CAPACITY = 2;
    private int[] elements;
    private int size = 0;

    public IntArray() {
        this.elements = new int[DEFAULT_CAPACITY];
    }

    public void add(int value) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size] = value;
        size++;
    }

    private void ensureCapacity() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("범위 초과");
        }
        return elements[index];
    }

    public int size() {
        return size;
    }
}
