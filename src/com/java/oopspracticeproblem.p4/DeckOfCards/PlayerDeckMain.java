package com.java.oopspracticeproblem.p4.DeckOfCards;

public class PlayerDeckMain {

    public static void main(String[] args) {

        Player p1 = new Player("Player 1");
        p1.addCard("Ace of Hearts");
        p1.addCard("10 of Clubs");

        System.out.println(p1.name);
        p1.display();
    }
}

