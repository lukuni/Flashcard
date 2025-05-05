import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class RecentMistakesFirstSorterTest {

    @Test
    public void testSortCardsByMistakes() {
        // Create mock cards with mistakes
        Card card1 = new Card("Question 1", "Answer 1", 2); // Mistakes: 2
        Card card2 = new Card("Question 2", "Answer 2", 1); // Mistakes: 1
        Card card3 = new Card("Question 3", "Answer 3", 3); // Mistakes: 3

        List<Card> cards = List.of(card1, card2, card3);
        RecentMistakesFirstSorter sorter = new RecentMistakesFirstSorter();
        List<Card> sortedCards = sorter.sortCards(cards);

        // Verify cards are sorted by the number of mistakes, in descending order
        assertEquals(card3, sortedCards.get(0)); // card3 has the most mistakes
        assertEquals(card1, sortedCards.get(1));
        assertEquals(card2, sortedCards.get(2)); // card2 has the least mistakes
    }
}
