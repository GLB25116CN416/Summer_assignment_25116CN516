import java.util.*;

public class CommonCharacter
 {

    /**
     * Finds common characters in all given strings.
     * @param strings Array of strings to compare.
     * @return Set of characters common to all strings.
     */
    public static Set<Character> findCommonCharacters(String[] strings) {
        if (strings == null || strings.length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or empty");
        }

        // Initialize with characters from the first string
        Set<Character> commonChars = new HashSet<>();
        if (strings[0] == null) {
            throw new IllegalArgumentException("String cannot be null");
        }
        for (char c : strings[0].toCharArray()) {
            commonChars.add(c);
        }

        // Intersect with characters from the rest of the strings
        for (int i = 1; i < strings.length; i++) {
            if (strings[i] == null) {
                throw new IllegalArgumentException("String cannot be null");
            }
            Set<Character> currentChars = new HashSet<>();
            for (char c : strings[i].toCharArray()) {
                currentChars.add(c);
            }
            commonChars.retainAll(currentChars); // Keep only common characters
            if (commonChars.isEmpty()) {
                break; // No common characters left
            }
        }

        return commonChars;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of strings: ");
            int n = sc.nextInt();
            sc.nextLine(); // consume newline

            if (n <= 0) {
                System.out.println("Number of strings must be positive.");
                return;
            }

            String[] strings = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter string " + (i + 1) + ": ");
                strings[i] = sc.nextLine();
            }

            Set<Character> result = findCommonCharacters(strings);

            if (result.isEmpty()) {
                System.out.println("No common characters found.");
            } else {
                System.out.println("Common characters: " + result);
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid data.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
