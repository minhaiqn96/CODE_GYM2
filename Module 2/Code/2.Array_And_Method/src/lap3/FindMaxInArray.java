package lap3;

import java.util.Scanner;

public class FindMaxInArray {
    public void findMax(int[] arr) {
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        System.out.print("Max of this array is: " + max + " at position " + index);
    }

    public static void main(String[] args) {
        FindMaxInArray FindMaxInArray = new FindMaxInArray();

        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter the size of array: ");
            size = scanner.nextInt();
        } while (size < 0 || size > 10);

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the value at position array[" + i + "]: ");
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        FindMaxInArray.findMax(array);
    }
}
