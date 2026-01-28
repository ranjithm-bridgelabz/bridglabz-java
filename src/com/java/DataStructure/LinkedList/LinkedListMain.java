package com.java.DataStructure.LinkedList;


import java.util.Scanner;

public class LinkedListMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        // UC1 & UC3
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        System.out.println("Enter the values:");
        for (int i = 0; i < n; i++) {
            list.append(sc.nextInt());
        }

        System.out.println("Linked List:");
        list.display();

        // UC7
        System.out.println("Enter the value to search:");
        int search = sc.nextInt();
        System.out.println("Search Result: " + list.search(search));

        // UC8
        System.out.println("Enter the key value to insert after:");
        int key = sc.nextInt();

        System.out.println("Enter the value to insert:");
        int value = sc.nextInt();

        list.insertAfter(key, value);
        System.out.println("Linked List after insertion:");
        list.display();

        // UC5
        System.out.println("Deleting the first element:");
        list.pop();
        list.display();

        // UC6
        System.out.println("Deleting the last element:");
        list.popLast();
        list.display();

        // UC9
        System.out.println("Enter the value to delete:");
        int del = sc.nextInt();
        list.delete(del);

        System.out.println("Linked List after deletion:");
        list.display();
        System.out.println("Size of Linked List: " + list.size());

        // UC10
        System.out.println("\nSorted Linked List");
        SortedLinkedList<Integer> sorted = new SortedLinkedList<>();

        System.out.println("Enter number of elements for sorted list:");
        int m = sc.nextInt();

        System.out.println("Enter the values:");
        for (int i = 0; i < m; i++) {
            sorted.add(sc.nextInt());
        }

        System.out.println("Sorted Linked List:");
        sorted.display();

        sc.close();
    }
}

