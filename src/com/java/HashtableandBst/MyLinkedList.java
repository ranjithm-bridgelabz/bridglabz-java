package com.java.HashtableandBst;

public class MyLinkedList<K, V> {

    MyMapNode<K, V> head;

    public void add(K key, V value) {
        MyMapNode<K, V> current = head;

        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        MyMapNode<K, V> newNode = new MyMapNode<>(key, value);
        newNode.next = head;
        head = newNode;
    }

    public V get(K key) {
        MyMapNode<K, V> current = head;
        while (current != null) {
            if (current.key.equals(key))
                return current.value;
            current = current.next;
        }
        return null;
    }

    public void remove(K key) {
        if (head == null) return;

        if (head.key.equals(key)) {
            head = head.next;
            return;
        }

        MyMapNode<K, V> current = head;
        while (current.next != null && !current.next.key.equals(key)) {
            current = current.next;
        }

        if (current.next != null)
            current.next = current.next.next;
    }

    public void display() {
        MyMapNode<K, V> current = head;
        while (current != null) {
            System.out.print(current.key + "=" + current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
