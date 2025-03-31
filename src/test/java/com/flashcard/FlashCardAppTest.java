import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FlashCardAppTest {

    @Test
    public void testHelpOption() {
        // Simulate running the app with --help flag
        String[] args = {"--help"};
        FlashCardApp app = new FlashCardApp();
        String output = app.run(args);
        assertTrue(output.contains("Usage"));
    }

    @Test
    public void testInvertCards() {
        // Simulate running the app with --invertCards flag
        String[] args = {"cards.txt", "--invertCards"};
        FlashCardApp app = new FlashCardApp();
        String output = app.run(args);
        // Check if the cards are inverted
        assertTrue(output.contains("Answer to Question"));
    }

    @Test
    public void testInvalidOrderOption() {
        // Simulate an invalid --order value
        String[] args = {"cards.txt", "--order", "invalid-option"};
        FlashCardApp app = new FlashCardApp();
        String output = app.run(args);
        assertTrue(output.contains("Invalid order option"));
    }
}
