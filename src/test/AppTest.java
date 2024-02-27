import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class AppTest {
    @Test
    public void printShouldShowExpectedOutput() {
        //Arrange
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        //Act
        App.greet(new PrintStream(out));
        String str = out.toString();

        //Assert
        assertEquals("Hello, World!" + System.lineSeparator(), str);
    }
}