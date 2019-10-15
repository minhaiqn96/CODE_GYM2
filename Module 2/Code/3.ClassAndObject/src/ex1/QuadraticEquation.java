package ex1;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(getB(), 2) - (4 * getA() * getC());
    }

    public double getRoot1() {
        double r1;
        r1 = (((-getB()) + (Math.sqrt(this.getDiscriminant()))) / (2 * getA()));
        return r1;
    }

    public double getRoot2() {
        double r2;
        r2 = (((-getB()) - (Math.sqrt(this.getDiscriminant()))) / (2 * getA()));
        return r2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the a value: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the b value: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the c value: ");
        double c = scanner.nextDouble();

        QuadraticEquation QuadraticEquation = new QuadraticEquation(a, b, c);

        if (QuadraticEquation.getDiscriminant() > 0) {
            System.out.println("2 roots of Equation r1= " + QuadraticEquation.getRoot1() + " and r2= " + QuadraticEquation.getRoot2());
        } else if (QuadraticEquation.getDiscriminant() == 0) {
            System.out.println("Equation has 2 roots same is: " + QuadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no root");
        }
    }
}
