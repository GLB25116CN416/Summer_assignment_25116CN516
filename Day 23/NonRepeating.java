import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeating {

    /**
     * Finds the first non-repeating character in a given string.
     * @param str Input string
     * @return First non-repeating character, or '\0' if none found
     */
    public static char findFirstNonRepeatingChar(String str) {
        if (str == null || str.isEmpty()) {
            return '\0'; // Return null character if string is empty or null
        }

        // LinkedHashMap preserves insertion order
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        // Count frequency of each character
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the first character with frequency 1
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '\0'; // No non-repeating character found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char result = findFirstNonRepeatingChar(input);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        scanner.close();
    }
}

