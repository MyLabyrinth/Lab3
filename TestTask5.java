import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.io.*;

public class TestTask5 {
    @Test
    public void testMadLibs() {
        String input = "0\n0\n0\n0\n0\nFirst\nLast\ndog\nwalk\nschool\nsmart\n"; // Skip 1-4
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Lab02.main(new String[]{});
        String result = out.toString();
        assertTrue("Task 5: Word 'dog' missing.", result.contains("dog"));
        assertTrue("Task 5: Word 'walk' missing.", result.contains("walk"));
    }
}
