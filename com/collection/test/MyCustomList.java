package com.collection.test;

import java.util.*;

public class MyCustomList<T extends Number> {
    List<T> list = new ArrayList<>();

    public void addElement(T element) {
        list.add(element);
    }

    public boolean removeElement(T element) {
        return list.remove(element);
    }

    public T get(Integer index) {
        return list.get(index);

    }

    public String toString() {
        return list.toString();

    }
}
