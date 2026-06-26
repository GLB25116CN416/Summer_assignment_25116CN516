import java.util.*;

/**
 * Program to find the element with missing frequency in an array.
 * Uses Scanner for input and HashMap for frequency counting.
 */
public class MissingFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Read array size
            System.out.print("Enter number of elements: ");
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

            // Count frequencies
            Map<Integer, Integer> freqMap = new HashMap<>();
            for (int num : arr) {
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            }

            // Find the most common frequency
            Map<Integer, Integer> freqCount = new HashMap<>();
            for (int count : freqMap.values()) {
                freqCount.put(count, freqCount.getOrDefault(count, 0) + 1);
            }

            int commonFreq = -1;
            int maxCount = 0;
            for (Map.Entry<Integer, Integer> entry : freqCount.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    commonFreq = entry.getKey();
                }
            }

            // Find element with frequency different from commonFreq
            Integer missingElement = null;
            for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
                if (entry.getValue() != commonFreq) {
                    missingElement = entry.getKey();
                    break;
                }
            }

            if (missingElement != null) {
                System.out.println("Element with missing frequency: " + missingElement);
            } else {
                System.out.println("No element with missing frequency found.");
            }

        } finally {
            sc.close();
        }
    }
}

