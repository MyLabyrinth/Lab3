import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.io.*;

public class TestTask2 {
    @Test
    public void testHowManyMinutes() {
        String input = "10\n20\n3\n15\n"; // Skip task 1, input 3 hours 15 mins
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Lab02.main(new String[]{});
        assertTrue("Task 2: Total minutes (3*60+15=195) not found.", out.toString().contains("195"));
    }
}