import java.util.Arrays;
import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input for rows and columns
        System.out.print("Enter number of rows for Matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns for Matrix: ");
        int cols = sc.nextInt();
        
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        // a) Transpose
        System.out.println("\n--- a) Transpose of Matrix ---");
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // b) Multiplication (Squaring the matrix for simplicity if it is square)
        System.out.println("\n--- b) Matrix Multiplication (Matrix * Matrix) ---");
        if (rows == cols) {
            int[][] result = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    for (int k = 0; k < rows; k++) {
                        result[i][j] += matrix[i][k] * matrix[k][j];
                    }
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Multiplication skipped: Original matrix is not a square matrix.");
        }
        
        // c) Product of diagonal elements and column elements
        System.out.println("\n--- c) Product of Diagonal Elements ---");
        int diagProduct = 1;
        for (int i = 0; i < rows && i < cols; i++) {
            diagProduct *= matrix[i][i];
        }
        System.out.println("Product of main diagonal: " + diagProduct);
        
        System.out.println("\n--- c) Product of Each Column's Elements ---");
        for (int j = 0; j < cols; j++) {
            int colProduct = 1;
            for (int i = 0; i < rows; i++) {
                colProduct *= matrix[i][j];
            }
            System.out.println("Product of column " + (j + 1) + ": " + colProduct);
        }
        
        // e) Sum of all elements ending with 4
        System.out.println("\n--- e) Sum of elements ending with 4 ---");
        int sumEndingIn4 = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (Math.abs(matrix[i][j]) % 10 == 4) {
                    sumEndingIn4 += matrix[i][j];
                }
            }
        }
        System.out.println("Sum: " + sumEndingIn4);
        
        // f) Print upper diagonal
        System.out.println("\n--- f) Upper Diagonal Matrix ---");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j >= i) System.out.print(matrix[i][j] + " ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
        
        // g) Print lower diagonal
        System.out.println("\n--- g) Lower Diagonal Matrix ---");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j <= i) System.out.print(matrix[i][j] + " ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
        
        // d) Sort the elements in array (Flattening to 1D, sorting, then printing)
        System.out.println("\n--- d) Sorted Elements of the Array ---");
        int[] flatArray = new int[rows * cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                flatArray[index++] = matrix[i][j];
            }
        }
        Arrays.sort(flatArray);
        for (int val : flatArray) {
            System.out.print(val + " ");
        }
        System.out.println();
        
        sc.close();
    }
}