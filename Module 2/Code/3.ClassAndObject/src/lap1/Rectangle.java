package lap1;

import java.util.Scanner;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle has width= " + width + " and " + "height= " + height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width value: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height value: ");
        double height = scanner.nextDouble();

        Rectangle Rectangle = new Rectangle(width, height);

        System.out.println("Rectangle Object " + Rectangle.display());
        System.out.println("Perimeter of rectangle is: " + Rectangle.getPerimeter());
        System.out.print("Area of rectangle is: " + Rectangle.getArea());
    }
}
