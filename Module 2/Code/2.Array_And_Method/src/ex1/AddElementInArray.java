package ex1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        int number;
        int index;
        int size;
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter in the number u want add: ");
        number = scanner.nextInt();
        System.out.print("Enter in the position u want insert: ");
        index = scanner.nextInt();
        int[] array = new int[arr.length + 1];
        if (index < 0 || index > arr.length - 1) {
            System.out.print("Don't add element to the array");
        } else {
            for (int i = array.length - 1; i > index; i--) {
                array[i] = arr[i - 1];
            }
            array[index] = number;
            for (int i = 0; i < index; i++) {
                array[i] = arr[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

//import java.lang.reflect.Array;
//import java.util.Scanner;
//
//public class AddElementInArray {
//    public static void main(String[] args) {
//        int number;
//        int index;
//        int size;
//        int[] arr = new int[100];
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Emter size of arr: ");
//        size = scanner.nextInt();
//
//        for (int i = 0; i < size; i++) {
//            System.out.print("Enter value at position: " + i + " : ");
//            arr[i] = scanner.nextInt();
//        }
//
//        System.out.print("Enter in the number u want add: ");
//        number = scanner.nextInt();
//        System.out.print("Enter in the position u want insert: ");
//        index = scanner.nextInt();
//
//        if (index < 0 || index > size) {
//            System.out.print("Don't add element to the array");
//        } else {
//            for (int i = size; i > index; i--) {
//                arr[i] = arr[i - 1];
//            }
//            arr[index] = number;
//            for (int i = 0; i <= size; i++) {
//                System.out.print(arr[i] + " ");
//            }
//        }
//    }
//}
