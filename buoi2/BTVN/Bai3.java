package BTVN;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        int currentNumber = 1;
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;

        while (currentNumber <= n * n) {
            // Fill from left to right (top row)
            for (int c = colStart; c <= colEnd; c++) {
                matrix[rowStart][c] = currentNumber++;
            }
            rowStart++; // Move the top boundary down

            // Fill from top to bottom (rightmost column)
            for (int r = rowStart; r <= rowEnd; r++) {
                matrix[r][colEnd] = currentNumber++;
            }
            colEnd--; // Move the right boundary left

            // Fill from right to left (bottom row) - only if there's still a row to fill
            if (rowStart <= rowEnd) {
                for (int c = colEnd; c >= colStart; c--) {
                    matrix[rowEnd][c] = currentNumber++;
                }
                rowEnd--; // Move the bottom boundary up
            }

            // Fill from bottom to top (leftmost column) - only if there's still a column to fill
            if (colStart <= colEnd) {
                for (int r = rowEnd; r >= rowStart; r--) {
                    matrix[r][colStart] = currentNumber++;
                }
                colStart++; // Move the left boundary right
            }
        }

        // Print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println(); // New line after each row
        }

        scanner.close();
    }
}