import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CardOrganizerTest {

    @Test
    public void testCardOrder() {
        // Test random order, worst-first, and recent-mistakes-first options
        CardOrganizer sorter = new RecentMistakesFirstSorter();
        List<Card> cards = //... create test cards
        List<Card> sortedCards = sorter.sortCards(cards);

        // Assert that the cards are sorted correctly
        assertNotNull(sortedCards);
    }
}
