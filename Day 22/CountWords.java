import java.util.Scanner;

public class CountWords{

    // Method to count words in a sentence
    public static int countWords(String sentence) {
        if (sentence == null) {
            return 0; // Null input
        }

        // Trim leading/trailing spaces
        sentence = sentence.trim();

        if (sentence.isEmpty()) {
            return 0; // Empty or only spaces
        }

        // Split by one or more whitespace characters (handles multiple spaces/tabs)
        String[] words = sentence.split("\\s+");

        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int wordCount = countWords(sentence);

        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }
}

