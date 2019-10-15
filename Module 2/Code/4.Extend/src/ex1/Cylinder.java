package ex1;

public class Cylinder extends Circle {
    private double height = 3;

    public Cylinder() {
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume(double radius, double height) {
        return getArea(radius) * height;
    }

    @Override
    public String toString() {
        return "Volume of this Cylinder has radius: "
                + getRadius()
                + " and color is: "
                + getColor()
                + " is: "
                + getVolume(getRadius(), getHeight());
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(5, 10, "White");
        System.out.println(cylinder);
    }
}