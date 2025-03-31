package com.flashcard;

public class FlashCard {
    private String question;
    private String answer;
    private int mistakeCount = 0;
    private int correctCount = 0;

    public FlashCard(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() { return question; }
    public String getAnswer() { return answer; }
    public int getMistakeCount() { return mistakeCount; }
    public int getCorrectCount() { return correctCount; }

    public void incrementMistake() { mistakeCount++; }
    public void incrementCorrect() { correctCount++; }
}
