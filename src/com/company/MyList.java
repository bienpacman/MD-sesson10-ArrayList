package com.company;

import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    protected void add(E element) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = element;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index :" + i + ", Size" + i);
        }
        return (E) elements[i];
    }

    public void add(int index, E element) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index :" + index + ",Size" + index);
        } else {
            size++;
            if (size == elements.length) {
                ensureCapa();
            }
            for (; index < size; index += 2) {
                E temp = (E) elements[index];
                elements[index] = element;
                element = (E) elements[index + 1];
                elements[index + 1] = temp;
            }
        }
    }

    public E remove(int index) {
        E removeValue = null;
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index not found");
        } else {
            removeValue = (E) elements[index];
            for (; index < size; index++) {
                elements[index] = elements[index + 1];
            }
            size--;
        }
        return removeValue;
    }

    public Object size() {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null) {
                size++;
            }
        }
        return size;

    }

    public MyList<E> clone() {
        MyList<E> list = new MyList<>();
        for (int i = 0; i < size; i++) {
            list.add((E) elements[i]);
        }
        return list;
    }
    public boolean contains(E o){
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o){
                return  true;
            }
        }
        return false;
    }
    public int indexOf (E o){
        int index = -1;
        for (int i = 0; i < elements.length ; i++) {
            if (elements[i] == o){
                index = i;
            }
        }
        if (index == -1){
            System.out.println("Không có trong mảng");
        }
        return index;
    }
    public void render() {
        for (int i = 0; i < this.getSize(); i++) {
            System.out.println(this.get(i));
        }
    }
    public void Clear(){
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }
}

