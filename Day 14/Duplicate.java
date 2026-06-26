import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicate
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input array size
            System.out.print("Enter the number of elements in the array: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                return;
            }
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Array size must be greater than 0.");
                return;
            }

            int[] arr = new int[n];

            // Input array elements
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter an integer:");
                    scanner.next(); // discard invalid input
                }
                arr[i] = scanner.nextInt();
            }

            // Find duplicates
            Set<Integer> seen = new HashSet<>();
            Set<Integer> duplicates = new HashSet<>();

            for (int num : arr) {
                if (!seen.add(num)) { // if already in 'seen', it's a duplicate
                    duplicates.add(num);
                }
            }

            // Output result
            if (duplicates.isEmpty()) {
                System.out.println("No duplicate elements found.");
            } else {
                System.out.println("Duplicate elements: " + duplicates);
            }

        } finally {
            scanner.close();
        }
    }
}
