import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {

    // Method to merge two integer arrays
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        if (arr1 == null) arr1 = new int[0];
        if (arr2 == null) arr2 = new int[0];

        int[] merged = new int[arr1.length + arr2.length];

        // Copy first array
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        // Copy second array
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);

        return merged;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input first array
            System.out.print("Enter size of first array: ");
            int size1 = sc.nextInt();
            if (size1 < 0) throw new IllegalArgumentException("Size cannot be negative.");
            int[] arr1 = new int[size1];
            System.out.println("Enter elements of first array:");
            for (int i = 0; i < size1; i++) {
                arr1[i] = sc.nextInt();
            }

            // Input second array
            System.out.print("Enter size of second array: ");
            int size2 = sc.nextInt();
            if (size2 < 0) throw new IllegalArgumentException("Size cannot be negative.");
            int[] arr2 = new int[size2];
            System.out.println("Enter elements of second array:");
            for (int i = 0; i < size2; i++) {
                arr2[i] = sc.nextInt();
            }

            // Merge arrays
            int[] mergedArray = mergeArrays(arr1, arr2);

            // Display merged array
            System.out.println("Merged Array: " + Arrays.toString(mergedArray));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

