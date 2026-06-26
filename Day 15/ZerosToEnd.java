
import java.util.Scanner;

public class ZerosToEnd {

    // Method to move all zeros to the end of the array
    public static void moveZeros(int[] arr) {
        if (arr == null || arr.length == 0) {
            return; // Nothing to process
        }

        int count = 0; // Position to place the next non-zero element

        // First pass: move all non-zero elements to the front
        for (int num : arr) {
            if (num != 0) {
                arr[count++] = num;
            }
        }

        // Second pass: fill the rest with zeros
        while (count < arr.length) {
            arr[count++] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the number of elements: ");
            int n = sc.nextInt();

            if (n < 0) {
                System.out.println("Array size cannot be negative.");
                return;
            }

            int[] arr = new int[n];
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            moveZeros(arr);

            System.out.println("Array after moving zeros to the end:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }
}
