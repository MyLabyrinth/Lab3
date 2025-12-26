import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.io.*;

public class TestTask3 {
    @Test
    public void testModuloHours() {
        String input = "10\n20\n3\n15\n1179\n"; // Skip 1 & 2, input 1179 mins
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Lab02.main(new String[]{});
        String result = out.toString();
        assertTrue("Task 3: Expected '19 hours' not found.", result.contains("19 hours"));
        assertTrue("Task 3: Expected '39 minutes' not found.", result.contains("39 minutes"));
    }
}
