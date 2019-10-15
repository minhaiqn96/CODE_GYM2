import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int year;
            boolean isLeapyear = false;
            System.out.print("Enter the year u want to check: ");
            year = scanner.nextInt();

            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isLeapyear = true;
                    } else isLeapyear = true;
                }
            }
            if (isLeapyear) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " isn't a leap year");
            }
        }
    }
}
