package com.java.DataStructure.StackandQueue;


import java.util.Scanner;

public class StackQueueMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ================= STACK =================
        System.out.println("STACK OPERATIONS");

        Stack<Integer> stack = new Stack<>();

        System.out.println("Enter number of elements for Stack:");
        int n = sc.nextInt();

        System.out.println("Enter values to push into Stack:");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }

        System.out.println("Stack:");
        stack.display();

        System.out.println("Peek element: " + stack.peek());

        System.out.println("Popping elements:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        // ================= QUEUE =================
        System.out.println("\nQUEUE OPERATIONS");

        Queue<Integer> queue = new Queue<>();

        System.out.println("Enter number of elements for Queue:");
        int m = sc.nextInt();

        System.out.println("Enter values to enqueue into Queue:");
        for (int i = 0; i < m; i++) {
            queue.enqueue(sc.nextInt());
        }

        System.out.println("Queue:");
        queue.display();

        System.out.println("Dequeuing elements:");
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }

        sc.close();
    }
}

