import java.util.Scanner;

public class StringLength{

    // Method to find string length without using length()
    public static int getStringLength(String str) {
        if (str == null) {
            return 0; // Handle null input safely
        }

        int count = 0;
        try {
            // Convert string to char array and count characters
            for (char c : str.toCharArray()) {
                count++;
            }
        } catch (Exception e) {
            System.out.println("Error while calculating length: " + e.getMessage());
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Calculate length
        int length = getStringLength(input);

        // Display result
        System.out.println("Length of the string is: " + length);

        sc.close();
    }
}

