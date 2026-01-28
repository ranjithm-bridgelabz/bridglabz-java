package com.java.HashtableandBst;

import java.util.Scanner;

public class HashTableMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MyHashTable<String, Integer> table = new MyHashTable<>();

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        String[] words = sentence.toLowerCase().split(" ");

        // UC1 & UC2: Find frequency
        for (String word : words) {
            Integer count = table.get(word);
            if (count == null)
                table.add(word, 1);
            else
                table.add(word, count + 1);
        }

        System.out.println("Word Frequency:");
        table.display();

        // UC3: Remove a word
        System.out.println("Enter word to remove:");
        String removeWord = sc.nextLine();

        table.remove(removeWord);

        System.out.println("After removing word:");
        table.display();

        sc.close();
    }
}
