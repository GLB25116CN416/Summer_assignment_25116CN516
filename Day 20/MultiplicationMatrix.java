import java.util.Scanner;

public class MultiplicationMatrix
 {

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int rows1 = firstMatrix.length;
        int cols1 = firstMatrix[0].length;
        int cols2 = secondMatrix[0].length;

        int[][] result = new int[rows1][cols2];

        // Matrix multiplication logic
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        return result;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input dimensions for first matrix
            System.out.print("Enter rows and columns of first matrix: ");
            int rows1 = sc.nextInt();
            int cols1 = sc.nextInt();

            // Input dimensions for second matrix
            System.out.print("Enter rows and columns of second matrix: ");
            int rows2 = sc.nextInt();
            int cols2 = sc.nextInt();

            // Validate matrix multiplication condition
            if (cols1 != rows2) {
                System.out.println("Error: Number of columns in first matrix must equal number of rows in second matrix.");
                return;
            }

            // Input first matrix
            int[][] firstMatrix = new int[rows1][cols1];
            System.out.println("Enter elements of first matrix:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    firstMatrix[i][j] = sc.nextInt();
                }
            }

            // Input second matrix
            int[][] secondMatrix = new int[rows2][cols2];
            System.out.println("Enter elements of second matrix:");
            for (int i = 0; i < rows2; i++) {
                for (int j = 0; j < cols2; j++) {
                    secondMatrix[i][j] = sc.nextInt();
                }
            }

            // Multiply matrices
            int[][] product = multiplyMatrices(firstMatrix, secondMatrix);

            // Display result
            System.out.println("Product of the matrices:");
            displayMatrix(product);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            sc.close();
        }
    }
}
