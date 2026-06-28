import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove all whitespace characters (spaces, tabs, newlines)
        String result = removeSpaces(input);

        // Display the result
        System.out.println("String without spaces: " + result);

        scanner.close();
    }

    /**
     * Removes all whitespace characters from the given string.
     * @param str The input string.
     * @return The string without any whitespace.
     */
    public static String removeSpaces(String str) {
        if (str == null) {
            return ""; // Handle null input safely
        }
        // \s matches any whitespace (space, tab, newline, etc.)
        return str.replaceAll("\\s+", "");
    }
}

