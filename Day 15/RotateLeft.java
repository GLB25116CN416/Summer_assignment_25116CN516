import java.util.Scanner;

public class RotateLeft {

    // Method to left rotate the array by d positions
    public static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        if (n == 0) return; // Empty array, nothing to rotate

        // Normalize d to be within array length
        d = ((d % n) + n) % n;

        // Temporary array to store rotated result
        int[] temp = new int[n];

        // Copy elements after rotation
        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + d) % n];
        }

        // Copy back to original array
        System.arraycopy(temp, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input array size
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Array size must be positive.");
                return;
            }

            int[] arr = new int[n];

            // Input array elements
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Input number of rotations
            System.out.print("Enter number of positions to rotate left: ");
            int d = sc.nextInt();

            // Perform rotation
            leftRotate(arr, d);

            // Output rotated array
            System.out.println("Array after left rotation:");
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
