import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionArray {

    // Method to find union of two arrays
    public static int[] findUnion(int[] arr1, int[] arr2) {
        Set<Integer> unionSet = new HashSet<>();

        // Add all elements from first array
        for (int num : arr1) {
            unionSet.add(num);
        }

        // Add all elements from second array
        for (int num : arr2) {
            unionSet.add(num);
        }

        // Convert Set to array
        int[] result = new int[unionSet.size()];
        int index = 0;
        for (int num : unionSet) {
            result[index++] = num;
        }
        return result;
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

            // Find union
            int[] unionArray = findUnion(arr1, arr2);

            // Display result
            System.out.println("Union of the two arrays:");
            for (int num : unionArray) {
                System.out.print(num + " ");
            }
            System.out.println();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

