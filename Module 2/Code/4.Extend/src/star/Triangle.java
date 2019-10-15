package star;

import java.util.Scanner;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return this.side1;
    }

    public void setSide1(double side1) {
        this.side2 = side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return (getSide1() + getSide2() + getSide3());
    }

    public double getArea() {
        double p = this.getPerimeter() / 2;
        return Math.pow((p - getSide1()) * (p - getSide2()) * (p - getSide3()), 0.5);
    }

    @Override
    public String toString() {
        return "A triangle has 3 side: "
                + getSide1() + " " + getSide2() + " " + getSide3()
                + ", color: "
                + super.getColor()
                + ", Perimeter: "
                + getPerimeter()
                + " and Area: "
                + getArea();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1, side2, side3;
        String color;
        System.out.print("Enter the side 1: ");
        side1 = scanner.nextDouble();
        System.out.print("Enter the side 2: ");
        side2 = scanner.nextDouble();
        System.out.print("Enter the side 3: ");
        side3 = scanner.nextDouble();
        System.out.print("Enter the color: ");
        color = scanner.next();

        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle(4, 5, 6);
        System.out.println(triangle);

        triangle = new Triangle(color, false, side1, side2, side3);
        System.out.println(triangle);
    }
}