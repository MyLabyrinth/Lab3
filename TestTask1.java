import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.*;

public class TestTask1 {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    @Before public void setUp() { System.setOut(new PrintStream(out)); }
    @After public void restore() { System.setOut(System.out); System.setIn(System.in); }

    @Test
    public void testSquareFeet() {
        String input = "10\n20\n"; // Width 10, Length 20
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Lab02.main(new String[]{});
        assertTrue("Task 1: Area calculation (10*20=200) not found.", out.toString().contains("200"));
    }
}