import java.util.Scanner;

public class StringCompression {

    /**
     * Compresses a string by replacing sequences of repeated characters
     * with the character followed by the count of its consecutive occurrences.
     * Returns the original string if compression does not reduce its length.
     *
     * @param input the original string
     * @return compressed string or original if not shorter
     */
    public static String compressString(String input) {
        if (input == null || input.isEmpty()) {
            return input; // Return as is for null or empty
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1; // Count of current character sequence

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(input.charAt(i - 1)).append(count);
                count = 1; // Reset count for new character
            }
        }
        // Append last character and its count
        compressed.append(input.charAt(input.length() - 1)).append(count);

        // Return compressed only if shorter
        return compressed.length() < input.length() ? compressed.toString() : input;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to compress: ");
        String input = scanner.nextLine();

        String result = compressString(input);
        System.out.println("Compressed string: " + result);

        scanner.close();
    }
}

