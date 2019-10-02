package com.playtika.javacourse.lytvynenko.stackcollection;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayStack extends AbstractCollection implements Stack{
    private ArrayList<Object> arrayList = new ArrayList<>();

    @Override
    public Iterator iterator() {
        return null; //arrayList.forEach((Object value) -> );
    }

    @Override
    public int size() {
        return arrayList.size();
    }

    @Override
    public void push(Object element) {
        arrayList.add(element);

    }

    @Override
    public Object pop() {
        return arrayList.remove(arrayList.size()-1);
    }
}
