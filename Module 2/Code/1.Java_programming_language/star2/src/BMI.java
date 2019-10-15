import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            double weight;
            double height;
            double BMI;
            System.out.print("Enter the Weight: ");
            weight = scanner.nextDouble();
            System.out.print("Enter the Height: ");
            height = scanner.nextDouble();
            BMI = weight / (Math.pow(height, 2));

            if (BMI < 18.5) {
                System.out.println("Underweight");
            } else if (18.5 <= BMI && BMI < 25) {
                System.out.println("Normal");
            } else if (25 <= BMI && BMI < 30) {
                System.out.println("Overweight");
            } else if (30 <= BMI) {
                System.out.println("Obese");
            }
        }
    }
}
