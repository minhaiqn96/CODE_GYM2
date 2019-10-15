package lap5;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public int[] createRandom() {
        Random random = new Random();
        int[] arr = new int[100];
        System.out.println("List elements of array: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = random.nextInt(100);
            System.out.print(arr[i] + " ");
            if (i % 10 == 9) {
                System.out.print("\n");
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsException ArrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
        int[] array = ArrayIndexOutOfBoundsException.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the any value: ");

        try {
            int x = scanner.nextInt();
            System.out.print("Value at index " + x + " is: " + array[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("The index exceeds the limit of the array");
        }
    }
}
