import java.util.Scanner;

public class Prime {
    public static int value;

    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Prime prime = new Prime();
        for (int i = 0; i <= 100; i++) {
            if (prime.isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}