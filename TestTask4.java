import java.io.*;
import java.util.regex.Pattern;

public class TestTask4 {
    public static void main(String[] args) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;
        System.setOut(new PrintStream(out));
        try {
            // Using a unique name to ensure it's not hardcoded from the example
            String f = "Pace";
            String l = "University";
            System.setIn(new ByteArrayInputStream((f + "\n" + l + "\n").getBytes()));
            
            Lab3.main(new String[]{});
            
            String res = out.toString();
            // Case insensitive check for the full name appearing
            boolean found = Pattern.compile("(?i)" + f + ".*" + l).matcher(res).find();

            if (found) {
                System.exit(0);
            } else {
                originalOut.println("Task 4 Fail: Could not find '" + f + " " + l + "' in output.");
                System.exit(1);
            }
        } catch (Exception e) { System.exit(1); }
        finally { System.setOut(originalOut); System.setIn(originalIn); }
    }
}