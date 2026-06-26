import java.util.Scanner;

public class MissingNumber {

    // Method to find the missing number using sum formula
    public static int findMissingNumber(int[] arr, int n) {
        // Expected sum of numbers from 1 to n
        long expectedSum = (long) n * (n + 1) / 2;
        long actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return (int) (expectedSum - actualSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the value of n (total numbers including the missing one): ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a positive integer.");
                return;
            }
            int n = sc.nextInt();

            if (n <= 1) {
                System.out.println("n must be greater than 1.");
                return;
            }

            int[] arr = new int[n - 1];
            System.out.println("Enter " + (n - 1) + " numbers between 1 and " + n + " (one number missing):");

            boolean[] seen = new boolean[n + 1]; // To check duplicates
            for (int i = 0; i < n - 1; i++) {
                if (!sc.hasNextInt()) {
                    System.out.println("Invalid input. Please enter integers only.");
                    return;
                }
                int value = sc.nextInt();

                if (value < 1 || value > n) {
                    System.out.println("Number out of range. Must be between 1 and " + n);
                    return;
                }
                if (seen[value]) {
                    System.out.println("Duplicate number detected: " + value);
                    return;
                }
                seen[value] = true;
                arr[i] = value;
            }

            int missing = findMissingNumber(arr, n);
            System.out.println("The missing number is: " + missing);

        } finally {
            sc.close();
        }
    }
}
