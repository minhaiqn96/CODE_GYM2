package star9;

import java.util.Scanner;

public class Sum1Column {

    public float sum(float[][] matrix, int row, int column) {
        float sum = 0;
        for (int i = 0; i < row; i++) {
            sum = sum + matrix[i][column];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sum1Column sum1Column = new Sum1Column();
        int row;
        int column;
        int columnEnter;

        System.out.print("Enter the row of matrix: ");
        row = scanner.nextInt();
        System.out.print("Enter the column of matrix: ");
        column = scanner.nextInt();

        float[][] matrix = new float[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter value at position matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextFloat();
            }
        }

        System.out.println("Matrix after is entered: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.print("Enter the column you want to sum: ");
        columnEnter = scanner.nextInt();
        System.out.print("Sum of column " + columnEnter + " in matrix : " + sum1Column.sum(matrix, row, columnEnter));
    }
}
