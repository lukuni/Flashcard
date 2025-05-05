import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FlashCardAppIntegrationTest {

    @Test
    public void testFullProcess() throws Exception {
        // Create a temporary file to simulate the card file
        String tempFile = "cards.txt";
        Files.write(Paths.get(tempFile), 
            "What is Java?; A programming language.\nWhat is OOP?; Object-Oriented Programming.".getBytes());

        // Simulate running the app with the card file and options
        String[] args = {tempFile, "--order", "random", "--repetitions", "2"};
        FlashCardApp app = new FlashCardApp();
        String output = app.run(args);
        
        // Test that the cards are processed correctly
        assertTrue(output.contains("What is Java?"));
        assertTrue(output.contains("What is OOP?"));
        
        // Clean up
        Files.delete(Paths.get(tempFile));
    }
}
