package com.java.HashtableandBst;


public class MyHashTable<K, V> {

    private final int SIZE = 10;
    MyLinkedList<K, V>[] bucketArray;

    @SuppressWarnings("unchecked")
    public MyHashTable() {
        bucketArray = new MyLinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            bucketArray[i] = new MyLinkedList<>();
        }
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    public void add(K key, V value) {
        int index = getIndex(key);
        bucketArray[index].add(key, value);
    }

    public V get(K key) {
        int index = getIndex(key);
        return bucketArray[index].get(key);
    }

    public void remove(K key) {
        int index = getIndex(key);
        bucketArray[index].remove(key);
    }

    public void display() {
        for (int i = 0; i < SIZE; i++) {
            bucketArray[i].display();
        }
    }
}

