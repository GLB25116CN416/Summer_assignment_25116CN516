import java.util.Scanner;

public class StringRotation
 {

    /**
     * Checks if s2 is a rotation of s1.
     * Uses the concatenation method: s2 must be a substring of s1+s1.
     *
     * @param s1 First string
     * @param s2 Second string
     * @return true if s2 is a rotation of s1, false otherwise
     */
    public static boolean areRotations(String s1, String s2) {
        // Validate nulls
        if (s1 == null || s2 == null) {
            return false;
        }

        // Lengths must match
        if (s1.length() != s2.length()) {
            return false;
        }

        // Both empty strings are rotations of each other
        if (s1.isEmpty() && s2.isEmpty()) {
            return true;
        }

        // Check if s2 is a substring of s1+s1
        String concatenated = s1 + s1;
        return concatenated.contains(s2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input strings
            System.out.print("Enter first string: ");
            String str1 = scanner.nextLine();

            System.out.print("Enter second string: ");
            String str2 = scanner.nextLine();

            // Check and display result
            if (areRotations(str1, str2)) {
                System.out.println("✅ \"" + str2 + "\" is a rotation of \"" + str1 + "\".");
            } else {
                System.out.println("❌ \"" + str2 + "\" is NOT a rotation of \"" + str1 + "\".");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

