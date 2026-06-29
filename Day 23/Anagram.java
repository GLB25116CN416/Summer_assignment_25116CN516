import java.util.Scanner;

public class Anagram{

    /**
     * Checks if two strings are anagrams (case-insensitive, ignores spaces).
     * @param str1 First string
     * @param str2 Second string
     * @return true if anagrams, false otherwise
     */
    public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false; // Null strings cannot be anagrams
        }

        // Normalize: remove spaces and convert to lowercase
        String s1 = str1.replaceAll("\\s+", "").toLowerCase();
        String s2 = str2.replaceAll("\\s+", "").toLowerCase();

        // Quick length check
        if (s1.length() != s2.length()) {
            return false;
        }

        // Frequency array for ASCII characters (256 possible)
        int[] count = new int[256];

        // Increment for s1, decrement for s2
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        // If all counts are zero, they are anagrams
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first string: ");
            String str1 = scanner.nextLine();

            System.out.print("Enter second string: ");
            String str2 = scanner.nextLine();

            if (areAnagrams(str1, str2)) {
                System.out.println("✅ The strings are anagrams.");
            } else {
                System.out.println("❌ The strings are NOT anagrams.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

