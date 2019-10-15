package star6;

import java.util.Scanner;

public class DeleteElementInArray {

    static int count = 0;

    public void deleteElement(int[] arr, int number) {
        int indexDel = 0;
        for (int i = 0; i < arr.length - count; i++) {
            if (arr[i] == number) {
                indexDel = i;
                for (int j = indexDel; j < arr.length - count - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                count++;
                i = -1;
            }
        }
    }

    public static void main(String[] args) {
        DeleteElementInArray delete = new DeleteElementInArray();
        Scanner scanner = new Scanner(System.in);
        int size;
        int number;
        do {
            System.out.print("Enter the amount of array: ");
            size = scanner.nextInt();
        } while (size < 0);

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the value at position array[" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the number u want to delete:");
        number = scanner.nextInt();

        delete.deleteElement(array, number);
        System.out.print("Array after delete element: ");
        for (int i = 0; i < array.length - count; i++) {
            System.out.print(array[i] + " ");
        }
    }
}