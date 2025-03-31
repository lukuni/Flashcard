package com.flashcard;

import java.util.*;

public class RecentMistakesFirstSorter implements CardOrganizer {
    @Override
    public List<FlashCard> organize(List<FlashCard> cards) {
        cards.sort(Comparator.comparingInt(FlashCard::getMistakeCount).reversed());
        return cards;
    }
}
