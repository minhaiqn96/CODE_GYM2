package ex1;

import java.util.Arrays;

public class MyList<E> {

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E e) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index " + index + ", Size " + index);
        } else if (index == this.size) {
            ensureCapa();
            elements[index] = e;
            this.size++;
        } else {
            for (int i = index; i < this.size; i++) {
                elements[i + 1] = elements[i];
            }
            elements[index] = e;
            this.size++;
        }
    }

    public void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index + ", Size " + index);
        } else {
            for (int i = index + 1; i < size; i++) {
                elements[i - 1] = elements[i];
            }
            size--;
        }
        return (E) elements[index];
    }

    public int size() {
        return this.size;
    }

    public E clone() {
        Object[] elementsCopy = new Object[size];
        for (int i = 0; i < this.size; i++) {
            elementsCopy[i] = elements[i];
        }
        return (E) elementsCopy;
    }

    public boolean contains(E o) {
        for (int i = 0; i < this.size; i++) {
            if (elements[i] == o) {
                return true;
            }
        }
        return false;
    }

        public int indexOf(E o) {
        for (int i = 0; i < this.size; i++) {
            if (elements[i] == o) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        if (this.size == elements.length) {
            ensureCapa();
        }
        elements[this.size++] = e;
        return true;
    }

    public E get(int i) {
        if (i < 0 || i > this.size) {
            throw new IndexOutOfBoundsException("Index " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public void clear() {
        elements = new Object[0];
        this.size = 0;
    }
}
