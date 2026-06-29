import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {

    /**
     * Removes duplicate characters from a string while preserving order.
     * @param input The original string.
     * @return A new string without duplicate characters.
     */
    public static String removeDuplicates(String input) {
        if (input == null || input.isEmpty()) {
            return input; // Return as is for null or empty input
        }

        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (seen.add(c)) { // add() returns false if character already exists
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove duplicates
        String output = removeDuplicates(input);

        // Display result
        System.out.println("String without duplicates: " + output);

        scanner.close();
    }
}
