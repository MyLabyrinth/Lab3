import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.*;
import java.util.Random;
import java.util.regex.Pattern;

public class TestTask1 {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @Before public void setUp() { System.setOut(new PrintStream(out)); }
    @After public void restore() { System.setOut(originalOut); System.setIn(originalIn); }

    @Test
    public void testSquareFeetLogic() {
        // Generate two random integers between 1 and 100
        Random rand = new Random();
        int randomWidth = rand.nextInt(100) + 1;
        int randomLength = rand.nextInt(100) + 1;
        int expectedArea = randomWidth * randomLength;

        // Feed the random numbers into the student's program
        String input = randomWidth + "\n" + randomLength + "\n"; 
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        
        // Execute Lab3
        Lab3.main(new String[]{});
        
        String output = out.toString();

        /* This Regex looks for the specific product of the two random numbers.
           It is case-insensitive and ignores surrounding text/headers.
        */
        boolean foundCorrectResult = Pattern.compile("(?i)area.*" + expectedArea)
                                            .matcher(output)
                                            .find();
        
        assertTrue("Task 1 Fail: Expected an area of " + expectedArea + 
                   " for width " + randomWidth + " and length " + randomLength + 
                   ", but it wasn't found in your output.", foundCorrectResult);
    }
}