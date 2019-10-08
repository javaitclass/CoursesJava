package com.playtika.javacourse.lytvynenko.stackcollection;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayStack<E> extends AbstractCollection<E> implements Stack<E> {

    private class MyIterator implements Iterator {
        private int index ;

        @Override
        public boolean hasNext() {
            return index != size - 1;

        }

        @Override
        public Object next() {
            if (index == size - 1){
                throw new NoSuchElementException();
            }
            return elements[index++];
        }
    }

    private final static int DEFAULT_SIZE_OF_ARRAY = 10;
    private Object[] elements;
    private int size = 0;


    public ArrayStack (){
        elements = new Object[DEFAULT_SIZE_OF_ARRAY];

    }

    private boolean isFull() {
        return (size >= elements.length);
    }

    public boolean isEmpty() {
        return (size == 0);
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public void push(E element) {

        if(isFull()) {
            elements = Arrays.copyOf(elements,Math.round(elements.length * 1.5f));
        }
        elements[size] = (E)element;
        size ++;
    }

    @Override
    public E pop() {
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        Object element = elements[size -1];
        elements[size - 1] = null;
        size --;
        return  (E) element;
    }

   @Override
    public Iterator iterator() {
       return new MyIterator();
        }
}


