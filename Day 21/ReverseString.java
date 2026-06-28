import java.util.Scanner;

public class ReverseString {
    
    // Method to reverse a string safely
    public static String reverse(String str) {
        if (str == null) {
            return null; // Handle null input
        }
        // Using StringBuilder for efficient reversal
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Validate input
        if (input.trim().isEmpty()) {
            System.out.println("Error: Empty string entered.");
        } else {
            String reversed = reverse(input);
            System.out.println("Reversed string: " + reversed);
        }

        scanner.close();
    }
}

