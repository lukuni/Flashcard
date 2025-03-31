package com.flashcard;

public class AchievementTracker {
    public static void checkAchievements(List<FlashCard> cards) {
        boolean allCorrect = cards.stream().allMatch(card -> card.getMistakeCount() == 0);
        boolean confident = cards.stream().anyMatch(card -> card.getCorrectCount() >= 3);
        boolean repeat = cards.stream().anyMatch(card -> card.getMistakeCount() >= 5);

        if (allCorrect) System.out.println("🏆 Achievement: CORRECT - All answers were correct!");
        if (confident) System.out.println("🏆 Achievement: CONFIDENT - At least one card was answered correctly 3+ times!");
        if (repeat) System.out.println("🏆 Achievement: REPEAT - A card was attempted 5+ times!");
    }
}
