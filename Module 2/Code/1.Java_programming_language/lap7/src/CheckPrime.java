import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.print("This number isn't a Prime");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println("Number " + number + " is a Prime");
            } else {
                System.out.println("Number " + number + " isn't a Prime");
            }
        }
    }
}
