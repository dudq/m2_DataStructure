package my_array_list_2;

import java.util.Arrays;

public class MyArrayList<E> {
    final int DEFAULT_CAPACITY = 10;
    int size = 0;
    private Object[] elements;

    public MyArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException("Capacity can't negative");
        else
            this.elements = new Object[capacity];
    }

    public boolean add(E element) {
        if (this.size == this.elements.length)
            ensureCapacity();
        this.elements[this.size] = element;
        this.size++;
        return true;
    }

    public void add(int index, E element) {
        checkIndex(index);
        if (this.size == this.elements.length)
            ensureCapacity();
        for (int i = this.size; i > index; i--) {
            this.elements[i] = this.elements[i - 1];
        }
        this.elements[index] = element;
        this.size++;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds");
    }

    private void ensureCapacity() {
        int newSize = this.elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void printList() {
        int i = 0;
        while (this.elements[i] != null || i < this.size) {
            System.out.print(this.elements[i] + "\t");
            i++;
        }
    }

    public E remove(int index) {
        checkIndex(index);
        E e = (E) this.elements[index];
        for (int i = index; i < this.size - 1; i++)
            this.elements[i] = this.elements[i + 1];
        this.elements[this.size - 1] = null;
        this.size--;
        return e;
    }

    public int getSize() {
        return this.size;
    }

    public boolean contains(E element) {
        for (int i = 0; i < this.size; i++) {
            if (element.equals(this.elements[i]))
                return true;
        }
        return false;
    }

    public MyArrayList clone() {
        MyArrayList newArrayList = new MyArrayList(this.elements.length);
        for (int i = 0; i < this.elements.length; i++) {
            newArrayList.elements[i] = this.elements[i];
        }
        return newArrayList;
    }

    public int indexOf(E element) {
        for (int i = 0; i < this.size; i++) {
            if (element.equals(this.elements[i]))
                return i;
        }
        return -1;
    }

    public E getElement(int index) {
        this.checkIndex(index);
        return (E) this.elements[index];
    }

    public void clear() {
        for (int i = size - 1; i > -1; i--)
            this.elements[i] = null;
        this.size = 0;
    }
}
