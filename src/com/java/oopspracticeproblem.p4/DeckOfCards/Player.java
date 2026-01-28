package com.java.oopspracticeproblem.p4.DeckOfCards;

class Player {
    String name;
    CardNode head;

    Player(String name) {
        this.name = name;
    }

    void addCard(String card) {
        CardNode node = new CardNode(card);
        if (head == null) head = node;
        else {
            CardNode temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = node;
        }
    }

    void display() {
        CardNode temp = head;
        while (temp != null) {
            System.out.println(temp.card);
            temp = temp.next;
        }
    }
}

class CardNode {
    String card;
    CardNode next;

    CardNode(String card) {
        this.card = card;
    }
}
