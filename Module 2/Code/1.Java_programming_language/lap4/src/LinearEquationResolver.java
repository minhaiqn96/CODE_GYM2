import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        float a;
        float b;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value a: ");
        a = scanner.nextFloat();
        System.out.print("Enter the value b: ");
        b = scanner.nextFloat();

        if(a != 0){
            float result = -b / a;

            int c = (int)result;
            System.out.printf("The solution is: %d", c);
        }
        else {
            if(b == 0){
                System.out.println("Equation pass with all x value");
            }
            else{
                System.out.println("No equation");
            }
        }
    }
}
