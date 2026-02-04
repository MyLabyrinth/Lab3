// Import the Scanner class to read user input
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the console
        Scanner scanner = new Scanner(System.in);

        // --- Task 1: Square Feet ---
        // BLOCK 1: VARIABLE DECLARATIONS
        // TODO: Declare all integer variables needed for width, length, and area.
        int width, length, area;

        // BLOCK 2: INPUT GATHERING (Prompts must precede scanner calls)
        // TODO: Prompt for and read the width, storing it in your variable.
        // TODO: Prompt for and read the length, storing it in your variable.
        
        System.out.print("Enter Width:");
        width = scanner.nextInt();

        System.out.print("Enter Length:");
        length = scanner.nextInt();

        // BLOCK 3: CALCULATIONS
        // TODO: Calculate the area and store it in your area variable.
        area = width * length;

        // BLOCK 4: FINAL OUTPUT
        System.out.println("\n--- Task 1: Square Feet ---");
        // TODO: Print the final calculated area.
        System.out.println("The area is: " + area);


        // --- Task 2: How Many Minutes? ---
        // BLOCK 1: VARIABLE DECLARATIONS
        // TODO: Declare all integer variables needed for hours, minutes, and totalMinutes.
        int task2Hours, task2Minutes, totalMinutesResult;

        // BLOCK 2: INPUT GATHERING
        // TODO: Prompt for and read the number of hours.
        System.out.print("Number of hours: ");
        task2Hours = scanner.nextInt();
        
        // TODO: Prompt for and read the number of minutes.
        System.out.print("Number of minutes: ");
        task2Minutes = scanner.nextInt();

        // BLOCK 3: CALCULATIONS
        // TODO: Calculate the total number of minutes.
        totalMinutesResult = (task2Hours * 60) + task2Minutes;

        // BLOCK 4: FINAL OUTPUT
        System.out.println("\n--- Task 2: How Many Minutes? ---");
        // TODO: Print the final result.
        System.out.println("The total number of minutes is: " + totalMinutesResult);


        // --- Task 3: Use the Force Harry! ---
        // BLOCK 1: VARIABLE DECLARATIONS
        // TODO: Declare all integer variables needed for the input, the calculated hours, and calculated minutes.
        int totalMinutesInput, calculatedHours, remainingMinutes;

        // BLOCK 2: INPUT GATHERING
        // TODO: Prompt for and read the total minutes from the user.
        System.out.print("Total minutes: ");
        totalMinutesInput = scanner.nextInt();

        // BLOCK 3: CALCULATIONS
        // TODO: Calculate the hours part using division.
        calculatedHours = totalMinutesInput / 60;
        // TODO: Calculate the remaining minutes part using the modulo operator.
        remainingMinutes = totalMinutesInput % 60;

        // BLOCK 4: FINAL OUTPUT
        System.out.println("\n--- Task 3: Use the Force Harry! ---");
        // TODO: Print the final result.
        System.out.println("Total time: " + calculatedHours + " hours " + remainingMinutes + " minutes");


        // This line is needed to clear the input buffer after reading numbers before you start reading Strings.
        scanner.nextLine(); 

        // --- Task 4: What’s Your Name? ---
        // BLOCK 1: VARIABLE DECLARATIONS
        // TODO: Declare all String variables needed for the first and last name.
        String firstName, lastName;

        // BLOCK 2: INPUT GATHERING
        // TODO: Prompt for and read the user's first name.
        System.out.print("What is your first name: ");
        firstName = scanner.nextLine();
        // TODO: Prompt for and read the user's last name.
        System.out.print("What is your last name: ");
        lastName = scanner.nextLine();
        
        // BLOCK 3: FINAL OUTPUT
        System.out.println("\n--- Task 4: What’s Your Name? ---");
        // TODO: Print the user's full name.
        System.out.println("Your full name is: " + firstName + " " + lastName);


        // --- Task 5: Mad Libs ---
        // BLOCK 1: VARIABLE DECLARATIONS
        // TODO: Declare all String variables needed for the Mad Libs words.
        String noun, verb, place, adjective;

        // BLOCK 2: INPUT GATHERING
        // TODO: Prompt for and read a noun, verb, place, and adjective.
        System.out.print("Enter a noun: ");
        noun = scanner.nextLine();
        System.out.print("Enter a verb: ");
        verb = scanner.nextLine();
        System.out.print("Enter a place: ");
        place = scanner.nextLine();
        System.out.print("Enter an adjective: ");
        adjective = scanner.nextLine();
        
        // BLOCK 3: FINAL OUTPUT
        System.out.println("\n--- Task 5: Mad Libs ---");
        // TODO: Print the final Mad Libs story.
        System.out.println("A " + noun + " took a " + verb + " by " + place + " because they were " + adjective + ".");


        // --- Task 6: DPS ---
        // BLOCK 1: VARIABLE DECLARATIONS
        // TODO: Declare variables for the name (String), dps (int), seconds (int), and totalDamage (int).
        String characterName;
        int dps, seconds, totalDamage;

        // BLOCK 2: INPUT GATHERING
        // TODO: Prompt for and read the character name.
        System.out.print("Name: ");
        characterName = scanner.nextLine();
        // TODO: Prompt for and read the DPS.
        System.out.print("DPS: ");
        dps = scanner.nextInt();
        // TODO: Prompt for and read the number of seconds.
        System.out.print("Seconds: ");
        seconds = scanner.nextInt();

        // BLOCK 3: CALCULATIONS
        // TODO: Calculate the total damage.
        totalDamage = dps * seconds;

        // BLOCK 4: FINAL OUTPUT
        System.out.println("\n--- Task 6: DPS ---");
        // TODO: Print the final sentence.
        System.out.println(characterName + " did " + dps + " dps for " + seconds + " seconds which is " + totalDamage + " damage.");


        // Close the scanner at the end of the program to prevent resource leaks.
        scanner.close();
    }
}
