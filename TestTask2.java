import java.io.*;
import java.util.Random;

public class TestTask2 {
    public static void main(String[] args) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;
        System.setOut(new PrintStream(out));
        try {
            Random rand = new Random();
            int h = rand.nextInt(24);
            int m = rand.nextInt(60);
            int expected = (h * 60) + m;
            System.setIn(new ByteArrayInputStream((h + "\n" + m + "\n").getBytes()));
            
            Lab3.main(new String[]{});
            
            String res = out.toString();
            if (res.contains(String.valueOf(expected))) {
                System.exit(0);
            } else {
                originalOut.println("Task 2 Fail: Expected " + expected + " minutes for " + h + "h " + m + "m.");
                System.exit(1);
            }
        } catch (Exception e) { System.exit(1); }
        finally { System.setOut(originalOut); System.setIn(originalIn); }
    }
}