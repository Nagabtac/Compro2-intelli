package com.mypackage;

import java.util.Scanner;

class Matrix {
    private int[][] data;
    private int rows;
    private int columns;

    // Constructor to initialize the matrix
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        data = new int[rows][columns];
    }

    // Method to fill the matrix with user input
    public void fillMatrix(Scanner scanner) {
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter value: ");
                data[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to get the sum of a specific row
    public int sumOfRow(int rowIndex) {
        if (rowIndex < 0 || rowIndex >= rows) {
            throw new IndexOutOfBoundsException("Invalid row index");
        }
        int sum = 0;
        for (int j = 0; j < columns; j++) {
            sum += data[rowIndex][j];
        }
        return sum;
    }

    // Method to get the sum of a specific column
    public int sumOfColumn(int colIndex) {
        if (colIndex < 0 || colIndex >= columns) {
            throw new IndexOutOfBoundsException("Invalid column index");
        }
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += data[i][colIndex];
        }
        return sum;
    }

    // Method to print the sum of all rows
    public void sumAllRows() {
        System.out.println("\nSum of each row:");
        for (int i = 0; i < rows; i++) {
            System.out.println("Row " + i + ": " + sumOfRow(i));
        }
    }

    // Method to print the sum of all columns
    public void sumAllColumns() {
        System.out.println("\nSum of each column:");
        for (int j = 0; j < columns; j++) {
            System.out.println("Column " + j + ": " + sumOfColumn(j));
        }
    }
}

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Create a Matrix object
        Matrix matrix = new Matrix(rows, columns);

        // Fill matrix with user input
        matrix.fillMatrix(scanner);

        // Compute and print sum of all rows
        matrix.sumAllRows();

        // Compute and print sum of all columns
        matrix.sumAllColumns();

        scanner.close();
    }
}
