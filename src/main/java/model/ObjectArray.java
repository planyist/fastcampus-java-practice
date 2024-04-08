package model;

import java.util.Arrays;

public class ObjectArray {
    private final int DEFAULT_CAPACITY = 2;
    private Object[] elements;
    private int size = 0;

    public ObjectArray() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(Object book) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size] = book;
        size++;
    }

    private void ensureCapacity() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("범위 초과");
        }
        return elements[index];
    }

    public int size() {
        return size;
    }
}
