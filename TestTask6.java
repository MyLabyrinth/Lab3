import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.io.*;

public class TestTask6 {
    @Test
    public void testDPS() {
        String input = "0\n0\n0\n0\n0\na\nb\nc\nd\ne\nf\nPharah\n120\n2\n"; // Skip 1-5
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Lab02.main(new String[]{});
        assertTrue("Task 6: Damage calculation (120*2=240) not found.", out.toString().contains("240"));
    }
}
