package com.playtika.javacourse.lytvynenko.stackcollection;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayStack<E> extends AbstractCollection implements Stack {


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
        Object o = elements[indexTop];
        elements[indexTop] = null;
        indexTop --;
        size --;
        return  (E) o;
    }


   @Override
    public Iterator iterator() {



        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }

        return null;
    }



}


