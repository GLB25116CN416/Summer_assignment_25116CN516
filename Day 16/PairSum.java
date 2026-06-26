import java.util.*;

/**
 * Program to find all unique pairs in an array whose sum equals a given target.
 */
public class PairSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Read array size
            System.out.print("Enter number of elements in the array: ");
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

            // Read array elements
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                if (!sc.hasNextInt()) {
                    System.out.println("Invalid input. Please enter integers only.");
                    return;
                }
                arr[i] = sc.nextInt();
            }

            // Read target sum
            System.out.print("Enter target sum: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                return;
            }
            int target = sc.nextInt();

            // Find and print pairs
            findPairs(arr, target);

        } finally {
            sc.close();
        }
    }

    /**
     * Finds and prints all unique pairs with the given sum.
     */
    public static void findPairs(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();
        Set<String> printedPairs = new HashSet<>();
        boolean found = false;

        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                // Sort pair to avoid duplicates like (3,7) and (7,3)
                int min = Math.min(num, complement);
                int max = Math.max(num, complement);
                String pairKey = min + "," + max;

                if (!printedPairs.contains(pairKey)) {
                    System.out.println("Pair found: (" + min + ", " + max + ")");
                    printedPairs.add(pairKey);
                    found = true;
                }
            }
            seen.add(num);
        }

        if (!found) {
            System.out.println("No pairs found with sum " + target);
        }
    }
}

