import java.util.Scanner;

public class Show20FirstPrime {

    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Show20FirstPrime show20FirstPrime = new Show20FirstPrime();
        Scanner scanner = new Scanner(System.in);
        int number;
        int count = 1;
        int n = 0;
        System.out.print("Enter the amount of number Prime u want to display: ");
        number = scanner.nextInt();
        while (count <= number) {
            if (show20FirstPrime.isPrime(n)) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
    }
}
