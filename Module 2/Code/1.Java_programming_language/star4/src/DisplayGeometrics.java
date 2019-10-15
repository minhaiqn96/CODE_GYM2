import java.util.Scanner;

public class DisplayGeometrics {

    public void rectangle() {
        // *  *  *  *  *
        // *  *  *  *  *
        // *  *  *  *  *
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }

    public void tritangle() {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Enter the edge u want: ");
        number = scanner.nextInt();
        //1 *
        // *  *
        // *  *  *
        // *  *  *  *
        // *  *  *  *  *
        if (number == 1) {
            for (int i = 0; i <= 5; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" * ");
                }
                System.out.print("\r\n");
            }
        }
        //2*****
        // ****
        //  ***
        //   **
        //    *
        if (number == 2) {
            for (int i = 1; i <= 5; i++) {
                for (int k = 1; k < i; k++) {
                    System.out.print(" ");
                }
                for (int j = 5 - i; j >= 0; j--) {
                    System.out.print("*");
                }
                System.out.print("\r\n");
            }
        }
        //3*  *  *  *  *
        // *  *  *  *
        // *  *  *
        // *  *
        // *
        if (number == 3) {
            for (int i = 5; i > 0; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                System.out.print("\n");
            }
        }
        // 4    *
        //    **
        //   ***
        //  ****
        // *****
        if (number == 4) {
            for (int i = 1; i <= 5; i++) {
                for (int j = 5; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int k = 5; k > 5 - i; k--) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
    }

    //      *
    //     ***
    //    *****
    //   *******
    //  *********
    // ***********
    public void isosceles() {
        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 5; k > 5 - i; k--) {
                System.out.print("*");
            }
            for (int j = 5; j <= 5 + i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        DisplayGeometrics displayGeometrics = new DisplayGeometrics();
        Scanner scanner = new Scanner(System.in);

        int number;

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Invite to enter your selection: ");
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    displayGeometrics.rectangle();
                    break;
                case 2:
                    displayGeometrics.tritangle();
                    break;
                case 3:
                    displayGeometrics.isosceles();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
