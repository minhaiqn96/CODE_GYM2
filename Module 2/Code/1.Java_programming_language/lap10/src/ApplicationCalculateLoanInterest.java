import java.util.Scanner;

public class ApplicationCalculateLoanInterest {
    public static void main(String[] args) {
        float result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the money: ");
        int money = scanner.nextInt();
        System.out.print("Enter the month: ");
        int month = scanner.nextInt();
        System.out.print("Enter the interset rate: ");
        float interset = scanner.nextFloat();

        result = money * ((interset / 100) / 12) * month;

        System.out.println("Total of interset: " + result);
    }
}
