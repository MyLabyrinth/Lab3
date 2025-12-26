import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.io.*;

public class TestTask4 {
    @Test
    public void testName() {
        String input = "0\n0\n0\n0\n0\nSarah\nLin\n"; // Skip 1-3
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Lab02.main(new String[]{});
        assertTrue("Task 4: Full name 'Sarah Lin' not found.", out.toString().contains("Sarah Lin"));
    }
}
