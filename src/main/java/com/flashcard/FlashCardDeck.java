package com.flashcard;

import java.io.*;
import java.util.*;

public class FlashCardDeck {
    private List<FlashCard> cards = new ArrayList<>();

    public void loadFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("=");
                if (parts.length == 2) cards.add(new FlashCard(parts[0].trim(), parts[1].trim()));
            }
        } catch (IOException e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
    }

    public List<FlashCard> getCards() { return cards; }
}
