package ex1;

public class Circle {
    private double radius = 2;
    private String color = "Blue";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(double radius) {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "A circle has just created with radius: "
                + getRadius()
                + " and color is: "
                + getColor();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(5.5, "Red");
        System.out.println(circle);
    }
}
