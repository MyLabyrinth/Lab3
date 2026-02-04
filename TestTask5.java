import java.io.*;

public class TestTask5 {
    public static void main(String[] args) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;
        System.setOut(new PrintStream(out));
        try {
            String n = "cat", v = "jump", p = "moon", a = "shiny";
            System.setIn(new ByteArrayInputStream((n + "\n" + v + "\n" + p + "\n" + a + "\n").getBytes()));
            
            Lab3.main(new String[]{});
            
            String res = out.toString().toLowerCase();
            boolean allPresent = res.contains(n) && res.contains(v) && res.contains(p) && res.contains(a);

            if (allPresent) {
                System.exit(0);
            } else {
                originalOut.println("Task 5 Fail: Story did not include all the user's words.");
                System.exit(1);
            }
        } catch (Exception e) { System.exit(1); }
        finally { System.setOut(originalOut); System.setIn(originalIn); }
    }
}