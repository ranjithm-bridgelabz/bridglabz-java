package com.java.DataStructure.StackandQueue;


public class LinkedList<T> {

    Node<T> head;

    // Add at beginning (used by Stack push)
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    // Add at end (used by Queue enqueue)
    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Remove first
    public T pop() {
        if (head == null) return null;
        T data = head.data;
        head = head.next;
        return data;
    }

    // Display
    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print("->");
            temp = temp.next;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return head == null;
    }
}

