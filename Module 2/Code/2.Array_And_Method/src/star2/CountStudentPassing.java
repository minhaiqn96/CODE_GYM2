package star2;

import java.util.Scanner;

public class CountStudentPassing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int count = 0;

        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
        } while (size < 0 || size > 10);

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the value array[" + i + "]: ");
            array[i] = scanner.nextInt();
            if (array[i] > 5 && array[i] <= 10) {
                count++;
            }
        }
        System.out.print("Amount student passing is: " + count);
    }
}


//        while (true) {
//            System.out.println("enter a size: ");
//            size = scanner.nextInt();
//            if (size < 0 || size > 10) {
//                System.out.println("The size shoud not exceed limit 10: ");
//                continue;
//            } else {
//                int[] array = new int[size];
//                for (int i = 0; i < array.length; i++) {
//                    System.out.print("Enter the value array[" + i + "]: ");
//                    array[i] = scanner.nextInt();
//                    if (array[i] > 5 && array[i] <= 10) {
//                        count++;
//                    }
//                }
//                break;
//            }
//        }
