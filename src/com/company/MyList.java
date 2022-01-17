package com.company;

import java.util.Arrays;

public class MyList <E> {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private Object [] elements;

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public int getSize(){
    return size;
    }

    public void add(E e){
        if(size == elements.length){
            int newSize = 2 * elements.length;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            elements[size] = e;
            size++;
        }
    }

    public E get(int index){
        if(index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size " + index );
        } else {
        return (E) elements[index];
        }
    }

    public void add(E e, int index){
        if(index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            for (int i = index; i < size; i++) {
                elements[i+1] = elements[i];
            }
            elements[index] = e;
        }
        size++;
    }

    public void remove(int index){
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException();
        } else {
            for (int i = index; i < size; i++) {
                elements[i] = elements[i+1];
            }
        }
        size--;
    }
}
