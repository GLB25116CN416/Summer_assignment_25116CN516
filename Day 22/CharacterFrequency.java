import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {

    // Method to count character frequency
    public static Map<Character, Integer> getCharFrequency(String str) {
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            // Increment count for each character
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        return freqMap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Input validation
        if (input == null || input.isEmpty()) {
            System.out.println("Error: String cannot be empty.");
            scanner.close();
            return;
        }

        // Get frequency map
        Map<Character, Integer> frequency = getCharFrequency(input);

        // Display results
        System.out.println("\nCharacter Frequencies:");
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }

        scanner.close();
    }
}

