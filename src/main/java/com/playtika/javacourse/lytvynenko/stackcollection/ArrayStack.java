package com.playtika.javacourse.lytvynenko.stackcollection;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayStack<E> extends AbstractCollection implements Stack {

    private class MyIterator implements Iterator {

        private int index = 0 ;

        @Override
        public boolean hasNext() {
            return index != indexTop;

        }

        @Override
        public Object next() {
            if (index == indexTop){
                throw new NoSuchElementException();
            }
            Object previous = elements[index];
            index ++;
            return previous;
        }
    }


    private final static int DEFAULT_SIZE_OF_ARRAY = 10;
    private Object[] elements;
    private int size = 0;
    private int indexTop = -1;

    public ArrayStack (){
        elements = new Object[DEFAULT_SIZE_OF_ARRAY];

    }

    private boolean isFull() {
        return (size >= elements.length);
    }

    public boolean isEmpty() {
        return (indexTop == -1);
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public void push(Object element) {

        if(isFull()) {
            elements = Arrays.copyOf(elements,Math.round(elements.length * 1.5f));
        }
        elements[++indexTop] = (E)element;
        size ++;
    }

    @Override
    public E pop() {
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        Object element = elements[indexTop];
        elements[indexTop] = null;
        indexTop --;
        size --;
        return  (E) element;
    }

   @Override
    public Iterator iterator() {
       return new MyIterator();
        }
}


