import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input array size
            System.out.print("Enter the number of elements: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                return;
            }
            int n = sc.nextInt();

            if (n < 2) {
                System.out.println("Array must have at least two elements.");
                return;
            }

            int[] arr = new int[n];

            // Input array elements
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                if (!sc.hasNextInt()) {
                    System.out.println("Invalid input. Please enter integers only.");
                    return;
                }
                arr[i] = sc.nextInt();
            }

            // Find second largest
            Integer largest = null;
            Integer secondLargest = null;

            for (int num : arr) {
                if (largest == null || num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num != largest && (secondLargest == null || num > secondLargest)) {
                    secondLargest = num;
                }
            }

            if (secondLargest == null) {
                System.out.println("No second largest distinct element found.");
            } else {
                System.out.println("Second largest element: " + secondLargest);
            }

        } finally {
            sc.close();
        }
    }
}

