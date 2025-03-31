package com.flashcard;

import java.io.*;
import java.util.*;

public class FlashCardApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: flashcard <cards-file> [options]");
            return;
        }

        String fileName = args[0];
        boolean invertCards = false;
        int repetitions = 1;
        String order = "random";

        for (int i = 1; i < args.length; i++) {
            switch (args[i]) {
                case "--help":
                    System.out.println("Usage: flashcard <cards-file> [options]");
                    return;
                case "--invertCards":
                    invertCards = true;
                    break;
                case "--order":
                    if (i + 1 < args.length) order = args[++i];
                    else System.out.println("Error: Missing value for --order");
                    return;
                case "--repetitions":
                    if (i + 1 < args.length) repetitions = Integer.parseInt(args[++i]);
                    else System.out.println("Error: Missing value for --repetitions");
                    return;
                default:
                    System.out.println("Unknown option: " + args[i]);
                    return;
            }
        }

        FlashCardDeck deck = new FlashCardDeck();
        deck.loadFromFile(fileName);

        FlashCardSession session = new FlashCardSession(deck.getCards(), invertCards, repetitions, order);
        session.start();
    }
}
