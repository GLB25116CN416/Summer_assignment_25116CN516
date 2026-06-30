import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Voting Eligibility Checker
 * Checks if a person is eligible to vote based on their age.
 */
public class VotingEligibility {

    // Minimum voting age constant
    private static final int MIN_VOTING_AGE = 18;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask for user's name
            System.out.print("Enter your name: ");
            String name = scanner.nextLine().trim();

            if (name.isEmpty()) {
                System.out.println("Name cannot be empty. Please try again.");
                return;
            }

            // Ask for user's age
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Validate age input
            if (age < 0 || age > 120) {
                System.out.println("Invalid age entered. Please enter a valid age between 0 and 120.");
                return;
            }

            // Check eligibility
            if (age >= MIN_VOTING_AGE) {
                System.out.println("✅ " + name + ", you are eligible to vote.");
            } else {
                System.out.println("❌ " + name + ", you are NOT eligible to vote. You must be at least " 
                                   + MIN_VOTING_AGE + " years old.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number for age.");
        } finally {
            scanner.close();
        }
    }
}
