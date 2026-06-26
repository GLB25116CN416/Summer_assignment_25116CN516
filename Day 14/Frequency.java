import java.util.InputMismatchException;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Read array size
            System.out.print("Enter the number of elements in the array: ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Array size must be greater than zero.");
                return;
            }

            int[] arr = new int[n];

            // Read array elements
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Read the element to search
            System.out.print("Enter the element to find its frequency: ");
            int target = sc.nextInt();

            // Count frequency
            int count = 0;
            for (int num : arr) {
                if (num == target) {
                    count++;
                }
            }

            // Display result
            if (count > 0) {
                System.out.println("The element " + target + " occurs " + count + " time(s) in the array.");
            } else {
                System.out.println("The element " + target + " is not present in the array.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }
}
