// Import the Scanner class to read user input
import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the console
        Scanner scanner = new Scanner(System.in);

        // --- Task 1: Square Feet ---
        // BLOCK 1: VARIABLE DECLARATIONS
        // TODO: Declare all integer variables needed for width, length, and area.

        // BLOCK 2: INPUT GATHERING (Prompts must precede scanner calls)
        // TODO: Prompt for and read the width, storing it in your variable.
        // TODO: Prompt for and read the length, storing it in your variable.

        // BLOCK 3: CALCULATIONS
        // TODO: Calculate the area and store it in your area variable.

        // BLOCK 4: FINAL OUTPUT
        System.out.println("\n--- Task 1: Square Feet ---");
        // TODO: Print the final calculated area.


        // --- Task 2: How Many Minutes? ---
        // BLOCK 1: VARIABLE DECLARATIONS
        // TODO: Declare all integer variables needed for hours, minutes, and totalMinutes.

        // BLOCK 2: INPUT GATHERING
        // TODO: Prompt for and read the number of hours.
        // TODO: Prompt for and read the number of minutes.

        // BLOCK 3: CALCULATIONS
        // TODO: Calculate the total number of minutes.

        // BLOCK 4: FINAL OUTPUT
        System.out.println("\n--- Task 2: How Many Minutes? ---");
        // TODO: Print the final result.


        // --- Task 3: Use the Force Harry! ---
        // BLOCK 1: VARIABLE DECLARATIONS
        // TODO: Declare all integer variables needed for the input, the calculated hours, and calculated minutes.

        // BLOCK 2: INPUT GATHERING
        // TODO: Prompt for and read the total minutes from the user.

        // BLOCK 3: CALCULATIONS
        // TODO: Calculate the hours part using division.
        // TODO: Calculate the remaining minutes part using the modulo operator.

        // BLOCK 4: FINAL OUTPUT
        System.out.println("\n--- Task 3: Use the Force Harry! ---");
        // TODO: Print the final result.


        // This line is needed to clear the input buffer after reading numbers before you start reading Strings.
        scanner.nextLine(); 

        // --- Task 4: What’s Your Name? ---
        // BLOCK 1: VARIABLE DECLARATIONS
        // TODO: Declare all String variables needed for the first and last name.

        // BLOCK 2: INPUT GATHERING
        // TODO: Prompt for and read the user's first name.
        // TODO: Prompt for and read the user's last name.
        
        // BLOCK 3: FINAL OUTPUT
        System.out.println("\n--- Task 4: What’s Your Name? ---");
        // TODO: Print the user's full name.


        // --- Task 5: Mad Libs ---
        // BLOCK 1: VARIABLE DECLARATIONS
        // TODO: Declare all String variables needed for the Mad Libs words.

        // BLOCK 2: INPUT GATHERING
        // TODO: Prompt for and read a noun, verb, place, and adjective.
        
        // BLOCK 3: FINAL OUTPUT
        System.out.println("\n--- Task 5: Mad Libs ---");
        // TODO: Print the final Mad Libs story.


        // --- Task 6: DPS ---
        // BLOCK 1: VARIABLE DECLARATIONS
        // TODO: Declare variables for the name (String), dps (int), seconds (int), and totalDamage (int).

        // BLOCK 2: INPUT GATHERING
        // TODO: Prompt for and read the character name.
        // TODO: Prompt for and read the DPS.
        // TODO: Prompt for and read the number of seconds.

        // BLOCK 3: CALCULATIONS
        // TODO: Calculate the total damage.

        // BLOCK 4: FINAL OUTPUT
        System.out.println("\n--- Task 6: DPS ---");
        // TODO: Print the final sentence.


        // Close the scanner at the end of the program to prevent resource leaks.
        scanner.close();
    }
}
