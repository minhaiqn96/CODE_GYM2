import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the number a: ");
            int a = scanner.nextInt();
            System.out.print("Enter the number b: ");
            int b = scanner.nextInt();

            a = Math.abs(a);
            b = Math.abs(b);

            if (a == 0 && b == 0) {
                System.out.println("No greatest common factor");
            } else if (a == 0 && b != 0) {
                System.out.println("Greatest common factor is: " + b);
            } else if (a != 0 && b == 0) {
                System.out.println("Greatest common factor is: " + a);
            } else {
                while (a != b) {
                    if (a > b) {
                        a = a - b;
                    } else {
                        b = b - a;
                    }
                }
                System.out.println("Greatest common factor is: " + a);
            }
        }
    }
}
