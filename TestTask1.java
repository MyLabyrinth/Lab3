import java.io.*;
import java.util.Random;
import java.util.regex.Pattern;

public class TestTask1 {
    public static void main(String[] args) {
        // 1. Setup capture
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;
        System.setOut(new PrintStream(out));

        try {
            // 2. Dynamic Logic
            Random rand = new Random();
            int width = rand.nextInt(100) + 1;
            int length = rand.nextInt(100) + 1;
            int expected = width * length;

            // 3. Inject Input
            String input = width + "\n" + length + "\n";
            System.setIn(new ByteArrayInputStream(input.getBytes()));

            // 4. Run Student file
            Lab3.main(new String[]{});

            // 5. Verify Result
            String output = out.toString();
            boolean passed = Pattern.compile("(?i)area.*" + expected).matcher(output).find();

            if (passed) {
                System.exit(0); // Exit code 0 = Success
            } else {
                originalOut.println("Task 1 Fail: Expected area " + expected + " for " + width + "x" + length);
                System.exit(1); // Exit code 1 = Failure
            }
        } catch (Exception e) {
            System.exit(1);
        } finally {
            System.setOut(originalOut);
            System.setIn(originalIn);
        }
    }
}