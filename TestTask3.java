import java.io.*;
import java.util.Random;

public class TestTask3 {
    public static void main(String[] args) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;
        System.setOut(new PrintStream(out));
        try {
            Random rand = new Random();
            int total = rand.nextInt(1440) + 61; // Up to 24 hours
            int h = total / 60;
            int m = total % 60;
            System.setIn(new ByteArrayInputStream((total + "\n").getBytes()));
            
            Lab3.main(new String[]{});
            
            String res = out.toString().toLowerCase();
            boolean hMatch = res.contains(h + " hour");
            boolean mMatch = res.contains(m + " minute");

            if (hMatch && mMatch) {
                System.exit(0);
            } else {
                originalOut.println("Task 3 Fail: Expected " + h + " hours and " + m + " minutes.");
                System.exit(1);
            }
        } catch (Exception e) { System.exit(1); }
        finally { System.setOut(originalOut); System.setIn(originalIn); }
    }
}
