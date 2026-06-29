import java.util.HashSet;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

public class RepeatingCharacter {

    /**
     * Finds the first repeating character in a given string.
     * @param input the string to search
     * @return Optional containing the first repeating character, or empty if none found
     */
    public static Optional<Character> findFirstRepeatingChar(String input) {
        if (input == null || input.isEmpty()) {
            return Optional.empty();
        }

        Set<Character> seen = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (!seen.add(c)) { // add() returns false if already present
                return Optional.of(c);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find and display result
        Optional<Character> result = findFirstRepeatingChar(input);
        if (result.isPresent()) {
            System.out.println("First repeating character: '" + result.get() + "'");
        } else {
            System.out.println("No repeating character found.");
        }

        scanner.close();
    }
}

