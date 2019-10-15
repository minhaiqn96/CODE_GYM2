import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width: ");
        width = scanner.nextFloat();
        System.out.println("Enter the height: ");
        height = scanner.nextFloat();
        System.out.println("Area Rectangle: " + (width * height));
    }
}
