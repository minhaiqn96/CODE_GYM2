package star1;

import java.util.Scanner;

public class ReserveElementInArray {
    public void reverseArray(int[] arr) {
        int n = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - n];
            arr[arr.length - 1 - n] = temp;
            n++;
        }
    }

    public static void main(String[] args) {
        ReserveElementInArray ReserveElement = new ReserveElementInArray();
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter the amount of array: " + " ");
            size = scanner.nextInt();
        } while (size < 0 || size > 10);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the value at position array[" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        ReserveElement.reverseArray(array);

        System.out.println("Array after is reversed: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
