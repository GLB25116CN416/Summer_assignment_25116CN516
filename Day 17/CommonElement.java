import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CommonElement {

    // Method to find common elements between two integer arrays
    public static Set<Integer> findCommonElements(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> common = new HashSet<>();

        // Add all elements of arr1 to set1
        for (int num : arr1) {
            set1.add(num);
        }

        // Check each element of arr2 for presence in set1
        for (int num : arr2) {
            if (set1.contains(num)) {
                common.add(num); // Add to common set (avoids duplicates)
            }
        }

        return common;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input first array
            System.out.print("Enter size of first array: ");
            int n1 = sc.nextInt();
            if (n1 <= 0) {
                System.out.println("Array size must be positive.");
                return;
            }
            int[] arr1 = new int[n1];
            System.out.println("Enter " + n1 + " integers for first array:");
            for (int i = 0; i < n1; i++) {
                arr1[i] = sc.nextInt();
            }

            // Input second array
            System.out.print("Enter size of second array: ");
            int n2 = sc.nextInt();
            if (n2 <= 0) {
                System.out.println("Array size must be positive.");
                return;
            }
            int[] arr2 = new int[n2];
            System.out.println("Enter " + n2 + " integers for second array:");
            for (int i = 0; i < n2; i++) {
                arr2[i] = sc.nextInt();
            }

            // Find and display common elements
            Set<Integer> common = findCommonElements(arr1, arr2);
            if (common.isEmpty()) {
                System.out.println("No common elements found.");
            } else {
                System.out.println("Common elements: " + common);
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }
}

