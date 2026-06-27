import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IntersectionArray {

    // Method to find intersection of two arrays
    public static int[] findIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        // Add all elements of arr1 to set1
        for (int num : arr1) {
            set1.add(num);
        }

        // Check elements of arr2 in set1
        for (int num : arr2) {
            if (set1.contains(num)) {
                intersection.add(num); // Avoid duplicates
            }
        }

        // Convert Set to int[]
        return intersection.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input first array
            System.out.print("Enter size of first array: ");
            int n1 = sc.nextInt();
            if (n1 < 0) throw new IllegalArgumentException("Array size cannot be negative.");
            int[] arr1 = new int[n1];
            System.out.println("Enter elements of first array:");
            for (int i = 0; i < n1; i++) {
                arr1[i] = sc.nextInt();
            }

            // Input second array
            System.out.print("Enter size of second array: ");
            int n2 = sc.nextInt();
            if (n2 < 0) throw new IllegalArgumentException("Array size cannot be negative.");
            int[] arr2 = new int[n2];
            System.out.println("Enter elements of second array:");
            for (int i = 0; i < n2; i++) {
                arr2[i] = sc.nextInt();
            }

            // Find intersection
            int[] result = findIntersection(arr1, arr2);

            // Display result
            if (result.length == 0) {
                System.out.println("No common elements found.");
            } else {
                System.out.println("Intersection: " + Arrays.toString(result));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

