import java.util.Scanner;

public class RotateRight {
    
    // Method to rotate array to the right by k positions
    public static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return; // Empty array, nothing to rotate
        
        // Normalize k to be within array length
        k = ((k % n) + n) % n; // Handles negative k as well
        
        // Reverse the whole array
        reverse(arr, 0, n - 1);
        // Reverse first k elements
        reverse(arr, 0, k - 1);
        // Reverse remaining elements
        reverse(arr, k, n - 1);
    }
    
    // Helper method to reverse part of the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            // Input array size
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();
            if (n < 0) {
                System.out.println("Array size cannot be negative.");
                return;
            }
            
            int[] arr = new int[n];
            
            // Input array elements
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            // Input rotation count
            System.out.print("Enter number of positions to rotate right: ");
            int k = sc.nextInt();
            
            // Perform rotation
            rightRotate(arr, k);
            
            // Output rotated array
            System.out.println("Array after right rotation:");
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

