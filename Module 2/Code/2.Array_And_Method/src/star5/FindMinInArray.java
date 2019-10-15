package star5;

import java.util.Scanner;

public class FindMinInArray {
    public void findMin(int[] arr) {
        int min = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        System.out.println("Min of this array is " + min + " at position " + index);
    }

    public static void main(String[] args) {
        FindMinInArray min = new FindMinInArray();
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.print("Enter the amount element of array: ");
        size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the value at position array[" + i + "]: ");
            array[i] = scanner.nextInt();
        }
        min.findMin(array);
    }
}

