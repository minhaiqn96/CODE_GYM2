package ex2;

import java.util.Scanner;

public class FindMaxIn2DimensionalArray {
    public void findMax(int[][] arr, int col, int row) {
        int max = arr[0][0];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.print("Max of this array is: " + max);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the column: ");
        int col = scanner.nextInt();
        System.out.print("Enter the row: ");
        int row = scanner.nextInt();

        FindMaxIn2DimensionalArray FindMaxIn2DimensionalArray = new FindMaxIn2DimensionalArray();
        int array[][] = new int[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("Enter the value at position array [" + i + "]" + "[" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.println(array[i][j]);
            }
        }
        FindMaxIn2DimensionalArray.findMax(array, col, row);
    }
}
