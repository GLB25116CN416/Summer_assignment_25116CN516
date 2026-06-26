import java.util.Scanner;

public class LinearSearch {
    
    // Method to perform linear search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input array size
            System.out.print("Enter number of elements: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                return;
            }
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Array size must be positive.");
                return;
            }

            int[] arr = new int[n];

            // Input array elements
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                while (!sc.hasNextInt()) {
                    System.out.println("Invalid input. Please enter an integer:");
                    sc.next(); // discard invalid input
                }
                arr[i] = sc.nextInt();
            }

            // Input target element
            System.out.print("Enter element to search: ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer:");
                sc.next();
            }
            int target = sc.nextInt();

            // Perform search
            int index = linearSearch(arr, target);

            // Output result
            if (index != -1) {
                System.out.println("Element found at index: " + index);
            } else {
                System.out.println("Element not found in the array.");
            }

        } finally {
            sc.close(); // Close scanner to prevent resource leak
        }
    }
}

