import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxOccurringCharacter {

    /**
     * Finds the maximum occurring character in a given string.
     * @param input The input string.
     * @return A Map.Entry containing the character and its frequency, or null if string is empty.
     */
    public static Map.Entry<Character, Integer> findMaxOccurringChar(String input) {
        if (input == null || input.isEmpty()) {
            return null; // No characters to process
        }

        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Count frequency of each character
        for (char ch : input.toCharArray()) {
            // You can skip spaces if you don't want them counted
            if (ch != ' ') {
                charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
            }
        }

        // Find the character with the maximum frequency
        Map.Entry<Character, Integer> maxEntry = null;
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }

        return maxEntry;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Map.Entry<Character, Integer> result = findMaxOccurringChar(input);

        if (result != null) {
            System.out.println("Maximum occurring character: '" + result.getKey() + "'");
            System.out.println("Number of occurrences: " + result.getValue());
        } else {
            System.out.println("The string is empty. No characters to process.");
        }

        scanner.close();
    }
}
