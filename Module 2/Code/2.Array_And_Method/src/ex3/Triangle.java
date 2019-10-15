package ex3;

import java.util.Scanner;

public class Triangle {

    public static void enterValue(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Value of tritangle edge isn't valid");
        } else if ((a + b < c) || (a + c < b) || (b + c < a)) {
            System.out.println("Value edges aren't valid");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the a value: ");
        int a = scanner.nextInt();
        System.out.print("Enter the b value: ");
        int b = scanner.nextInt();
        System.out.print("Enter the c value: ");
        int c = scanner.nextInt();
        try {
            if ((a >= 0 && b >= 0 && c >= 0) && (a + b > c && a + c > b && b + c > a)) {
                System.out.println("The edges of tritangle are valid");
            } else {
                throw new Exception();
            }
        } catch (Exception e){
            enterValue(a,b,c);
        }
    }

}
