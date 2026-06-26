
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask for array size
            System.out.print("Enter the number of elements in the array: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer for size.");
                return;
            }
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Array size cannot be negative.");
                return;
            }
            if (n == 0) {
                System.out.println("Empty array. Nothing to reverse.");
                return;
            }

            int[] arr = new int[n];

            // Input array elements
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter integers only.");
                    return;
                }
                arr[i] = scanner.nextInt();
            }

            // Reverse the array in-place
            for (int i = 0, j = n - 1; i < j; i++, j--) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            // Display reversed array
            System.out.println("Reversed array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();

        } finally {
            scanner.close(); // Always close scanner to avoid resource leaks
        }
    }
}
