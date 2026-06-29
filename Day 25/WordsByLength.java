
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class WordsByLength {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a sentence from the user
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine().trim();

        // Handle empty input
        if (input.isEmpty()) {
            System.out.println("No words to sort.");
            return;
        }

        // Split into words (ignoring multiple spaces)
        String[] words = input.split("\\s+");

        // Sort by length, then alphabetically
        Arrays.sort(words, Comparator
                .comparingInt(String::length) // primary: length
                .thenComparing(String::compareToIgnoreCase)); // secondary: alphabetical

        // Display sorted words
        System.out.println("Sorted words by length:");
        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }
}
