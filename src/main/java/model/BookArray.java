package model;

import java.util.Arrays;

public class BookArray {
    private final int DEFAULT_CAPACITY = 2;
    private Book[] elements;
    private int size = 0;

    public BookArray() {
        this.elements = new Book[DEFAULT_CAPACITY];
    }

    public void add(Book book) {
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

    public Book get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("범위 초과");
        }
        return elements[index];
    }

    public int size() {
        return size;
    }
}
