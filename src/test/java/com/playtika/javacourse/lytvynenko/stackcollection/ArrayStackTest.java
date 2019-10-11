package com.playtika.javacourse.lytvynenko.stackcollection;

import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class ArrayStackTest {

    private ArrayStack<String> myArrayStack = new ArrayStack<>();

    @Test
    public void shouldReturnAddedElement () {
        String result = "";
        myArrayStack.push("Hello");
        Iterator<String> iterator = myArrayStack.iterator();
        while(iterator.hasNext()){

            result = iterator.next();
        }
        assertEquals("Hello", result);
    }

    @Test
    public void shouldReturnSize (){
        myArrayStack.push("");
        myArrayStack.push("");
        assertEquals(2, myArrayStack.size());
    }

    @Test
    public void hasNext() {
    }

    @Test
    public void next() {
    }

    /*@Test
    public void size() {
    }

    @Test
    public void push() {
    }

    @Test
    public void pop() {
    }

    @Test
    public void iterator() {
    }*/
}