package my_array_list;

import java.util.Arrays;

public class MyArrayList<E> {
    final int DEFAULT_CAPACITY = 10;
    int size = 0;
    private Object[] elements;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E element) {
        if (this.size == this.elements.length) {
            ensureCapacity();
        }
        this.elements[this.size] = element;
        this.size++;
    }

    public void ensureCapacity() {
        int newSize = this.elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + this.size);
        }
        return (E) elements[i];
    }


}
