import java.io.*;
import java.util.Random;

public class TestTask6 {
    public static void main(String[] args) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;
        System.setOut(new PrintStream(out));
        try {
            Random rand = new Random();
            String name = "Zenyatta";
            int dps = rand.nextInt(200) + 10;
            int sec = rand.nextInt(10) + 1;
            int expected = dps * sec;
            
            System.setIn(new ByteArrayInputStream((name + "\n" + dps + "\n" + sec + "\n").getBytes()));
            
            Lab3.main(new String[]{});
            
            String res = out.toString();
            if (res.contains(name) && res.contains(String.valueOf(expected))) {
                System.exit(0);
            } else {
                originalOut.println("Task 6 Fail: Expected " + expected + " damage for " + name + ".");
                System.exit(1);
            }
        } catch (Exception e) { System.exit(1); }
        finally { System.setOut(originalOut); System.setIn(originalIn); }
    }
}