import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NamesAlphabetically {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        System.out.print("Enter the number of names: ");
        int n;

        // Validate integer input
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }
        n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        if (n <= 0) {
            System.out.println("Number of names must be greater than zero.");
            return;
        }

        // Read names
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            String name = scanner.nextLine().trim();
            if (name.isEmpty()) {
                System.out.println("Name cannot be empty. Please re-enter.");
                i--; // retry this index
                continue;
            }
            names.add(name);
        }

        // Sort names alphabetically (case-insensitive)
        Collections.sort(names, String.CASE_INSENSITIVE_ORDER);

        // Display sorted names
        System.out.println("\nNames in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
