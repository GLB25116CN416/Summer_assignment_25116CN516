import java.util.Scanner;

public class LowercaseToUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Validate input (non-empty)
        if (input == null || input.trim().isEmpty()) {
            System.out.println("Error: Input cannot be empty.");
            scanner.close();
            return;
        }

        // Convert to uppercase
        String upperCaseString = input.toUpperCase();

        // Display result
        System.out.println("Uppercase: " + upperCaseString);

        scanner.close();
    }
}

