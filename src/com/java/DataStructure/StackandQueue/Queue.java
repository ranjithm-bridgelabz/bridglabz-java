package com.java.DataStructure.StackandQueue;


public class Queue<T> {

    LinkedList<T> list = new LinkedList<>();

    // UC3: Enqueue
    public void enqueue(T data) {
        list.append(data);
    }

    // UC4: Dequeue
    public T dequeue() {
        return list.pop();
    }

    public void display() {
        list.display();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
