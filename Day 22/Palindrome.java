import java.util.Scanner;

public class Palindrome {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false; // Null strings are not palindromes
        }

        // Remove all non-alphanumeric characters and convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        // Compare characters from both ends
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false; // Mismatch found
            }
            left++;
            right--;
        }
        return true; // All characters matched
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("✅ The string is a palindrome.");
        } else {
            System.out.println("❌ The string is NOT a palindrome.");
        }

        scanner.close();
    }
}

