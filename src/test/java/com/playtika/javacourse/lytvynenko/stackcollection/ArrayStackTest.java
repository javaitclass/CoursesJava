package com.playtika.javacourse.lytvynenko.stackcollection;

import org.junit.Test;
import java.util.Iterator;
import static org.junit.Assert.*;

public class ArrayStackTest {

    private ArrayStack<String> myArrayStack = new ArrayStack<>();

    @Test
    public void shouldReturnAddedElement() {
        myArrayStack.push("Hello");
        Iterator<String> iterator = myArrayStack.iterator();
        String result = iterator.next();
        assertEquals("Hello", result);
    }

    @Test
    public void shouldReturnSize() {
        myArrayStack.push("");
        myArrayStack.push("");
        assertEquals(2, myArrayStack.size());
    }

    @Test
    public void shouldRemoveTopElement() {
        Iterator<String> iterator = myArrayStack.iterator();
        myArrayStack.push("a");
        myArrayStack.push("b");
        myArrayStack.push("c");
        myArrayStack.pop();
        String result = "";
        while (iterator.hasNext()){
            result = iterator.next();
        }
        assertEquals("b", result);
    }

    @Test
    public void shouldReturnRemovedElement() {
        Iterator<String> iterator = myArrayStack.iterator();
        myArrayStack.push("a");
        myArrayStack.push("b");
        myArrayStack.push("c");
        String result = myArrayStack.pop();
        assertEquals("c", result);
    }

    @Test
    public void ShouldReturnTrueIfNextElementPresent() {
        Iterator<String> iterator = myArrayStack.iterator();
        Boolean result;
        myArrayStack.push("a");
        myArrayStack.push("b");
        myArrayStack.push("c");
        result = iterator.hasNext();
        assertEquals(true, result);
        result = iterator.hasNext();
        assertEquals(true, result);
        result = iterator.hasNext();
        assertEquals(false, result);
    }

    @Test
    public void ShouldReturnNextElement() {
        Iterator<String> iterator = myArrayStack.iterator();
        myArrayStack.push("a");
        myArrayStack.push("b");
        myArrayStack.push("c");
        String result;
        result = iterator.next();
        assertEquals("a", result);
        result = iterator.next();
        assertEquals("b", result);
        result = iterator.next();
        assertEquals("c", result);
    }
}
