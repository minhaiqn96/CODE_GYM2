import java.util.Scanner;

public class CurrencyConversionApplication {

    public double usdToVND(double number) {
        return number * 23000;
    }

    public double vndToUSD(double number) {
        return number / 23000;
    }

    public static void main(String[] args) {
        CurrencyConversionApplication currencyConversion = new CurrencyConversionApplication();
        Scanner scanner = new Scanner(System.in);
        int type;
        double money;

        while (true) {
            System.out.println("Menu");
            System.out.println("1. USD to VND");
            System.out.println("2. VND to USD");
            System.out.print("Enter the type u want to convert: ");
            type = scanner.nextInt();
            System.out.print("Enter the money u want to convert: ");
            money = scanner.nextDouble();

            switch (type) {
                case 1:
                    System.out.println("Value after is converted: " + currencyConversion.usdToVND(money));
                    break;
                case 2:
                    System.out.println("Value after is converted: " + currencyConversion.vndToUSD(money));
                    break;
            }
        }
    }
}