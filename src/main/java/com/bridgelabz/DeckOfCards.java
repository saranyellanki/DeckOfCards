package com.bridgelabz;

import java.util.Arrays;

public class DeckOfCards {
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[] suitRank = new String[52];

    public void buildSuitRank(){
        int k = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                suitRank[k] = suit + " " + rank;
                k++;
            }
        }
    }
    public void showSuitRank(){
        System.out.println(Arrays.toString(suitRank));
    }

    public static void main(String[] args) {
        DeckOfCards deckOfCardsObj = new DeckOfCards();
        deckOfCardsObj.buildSuitRank();
        deckOfCardsObj.showSuitRank();
    }
}
