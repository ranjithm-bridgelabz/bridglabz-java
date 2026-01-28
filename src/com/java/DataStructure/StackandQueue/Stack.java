package com.java.DataStructure.StackandQueue;


public class Stack<T> {

    LinkedList<T> list = new LinkedList<>();

    // UC1: Push
    public void push(T data) {
        list.add(data);
    }

    // UC2: Peek
    public T peek() {
        if (list.head == null) return null;
        return list.head.data;
    }

    // UC2: Pop
    public T pop() {
        return list.pop();
    }

    public void display() {
        list.display();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
