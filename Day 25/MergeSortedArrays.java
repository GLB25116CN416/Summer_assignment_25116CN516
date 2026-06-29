
import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArrays {

    /**
     * Merges two sorted integer arrays into a single sorted array.
     * @param arr1 First sorted array
     * @param arr2 Second sorted array
     * @return Merged sorted array
     */
    public static int[] merge(int[] arr1, int[] arr2) {
        // Handle null arrays
        if (arr1 == null) arr1 = new int[0];
        if (arr2 == null) arr2 = new int[0];

        int n = arr1.length, m = arr2.length;
        int[] result = new int[n + m];

        int i = 0, j = 0, k = 0;

        // Merge elements while both arrays have elements
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        // Copy remaining elements from arr1
        while (i < n) {
            result[k++] = arr1[i++];
        }

        // Copy remaining elements from arr2
        while (j < m) {
            result[k++] = arr2[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input first sorted array
            System.out.print("Enter size of first sorted array: ");
            int n1 = sc.nextInt();
            if (n1 < 0) throw new IllegalArgumentException("Array size cannot be negative.");
            int[] arr1 = new int[n1];
            System.out.println("Enter " + n1 + " sorted integers for first array:");
            for (int i = 0; i < n1; i++) {
                arr1[i] = sc.nextInt();
            }

            // Input second sorted array
            System.out.print("Enter size of second sorted array: ");
            int n2 = sc.nextInt();
            if (n2 < 0) throw new IllegalArgumentException("Array size cannot be negative.");
            int[] arr2 = new int[n2];
            System.out.println("Enter " + n2 + " sorted integers for second array:");
            for (int i = 0; i < n2; i++) {
                arr2[i] = sc.nextInt();
            }

            // Merge arrays
            int[] merged = merge(arr1, arr2);

            // Output merged array
            System.out.println("Merged Sorted Array: " + Arrays.toString(merged));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
