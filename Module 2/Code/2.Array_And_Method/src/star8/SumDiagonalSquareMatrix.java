package star8;

import java.util.Scanner;

public class SumDiagonalSquareMatrix {

    public double sumMainDiagonal(float[][] matrix, int number) {
        double sum = 0;
        for (int i = 0; i < number; i++) {
            sum = sum + matrix[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SumDiagonalSquareMatrix sumDiagonal = new SumDiagonalSquareMatrix();
        int value;
        System.out.print("Enter the value of square matrix: ");
        value = scanner.nextInt();

        float[][] matrix = new float[value][value];

        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value; j++) {
                System.out.print("Enter the value at position matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextFloat();
            }
        }

        System.out.println("Matrix after is entered: ");
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.print("Sum of elements in main diagonal square matrix is: "
                + sumDiagonal.sumMainDiagonal(matrix, value));
    }
}
