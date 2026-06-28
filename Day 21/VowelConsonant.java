import java.util.Scanner;

public class VowelConsonant {

    // Method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // Case-insensitive check
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Validate input
        if (input == null || input.trim().isEmpty()) {
            System.out.println("Error: Input string cannot be empty.");
            scanner.close();
            return;
        }

        int vowelCount = 0;
        int consonantCount = 0;

        // Loop through each character
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) { // Only count alphabetic characters
                if (isVowel(ch)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        // Display results
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);

        scanner.close();
    }
}

