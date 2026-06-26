import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
    
    // Method to remove duplicates from an integer array
    public static int[] removeDuplicates(int[] array) {
        if (array == null || array.length == 0) {
            return new int[0]; // Return empty array for null or empty input
        }

        // LinkedHashSet preserves insertion order and removes duplicates
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : array) {
            set.add(num);
        }

        // Convert Set back to int[]
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Array size must be positive.");
                return;
            }

            int[] array = new int[n];
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }

            int[] uniqueArray = removeDuplicates(array);

            System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }
}
