package star4;

import java.util.Scanner;

public class PoolingArray {
    public void pooling(int[] array1, int size1, int[] array2, int size2) {
        int size3;
        size3 = size1 + size2;
        int[] array3 = new int[size3];
        for (int i = 0; i < array3.length; i++) {
            if (i < array1.length) {
                array3[i] = array1[i];
            } else {
                array3[i] = array2[i - size1];
            }
        }
        System.out.print("Array after is pooled: ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }

    public static void main(String[] args) {
        PoolingArray Pooling = new PoolingArray();
        Scanner scanner = new Scanner(System.in);
        int size1;
        int size2;

        System.out.print("Enter the size of array 1: ");
        size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Enter the value at position array1[" + i + "]: ");
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of array 2: ");
        size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Enter the value at position array2[" + i + "]: ");
            array2[i] = scanner.nextInt();
        }
        Pooling.pooling(array1, size1, array2, size2);
    }
}