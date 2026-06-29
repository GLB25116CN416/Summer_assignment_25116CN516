import java.util.*;

public class LongestWord
 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Step 1: Read input from user
            System.out.print("Enter a sentence: ");
            String input = scanner.nextLine();

            // Step 2: Validate input
            if (input == null || input.trim().isEmpty()) {
                System.out.println("No words found. Please enter a valid sentence.");
                return;
            }

            // Step 3: Remove punctuation and split into words
            String[] words = input.replaceAll("[^a-zA-Z0-9\\s]", "").split("\\s+");

            // Step 4: Find the longest word using Streams
            Optional<String> longestWord = Arrays.stream(words)
                    .max(Comparator.comparingInt(String::length));

            // Step 5: Display result
            if (longestWord.isPresent()) {
                System.out.println("Longest word: " + longestWord.get());
                System.out.println("Length: " + longestWord.get().length());
            } else {
                System.out.println("No words found.");
            }
        }
    }
}

