package lap1;

import lap1.inter.Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }


    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "A Cirle with radius= "
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);

        circle1 = new Circle(5.5);
        System.out.println(circle1);

        circle1 = new Circle("Black", true, 3);
        System.out.println(circle1);
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius * Math.sqrt(1 + (percent / 100));
    }
}
