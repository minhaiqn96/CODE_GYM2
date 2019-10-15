package lap1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        System.out.print("S before change radius circle: ");
        System.out.println(circle.getArea());
        System.out.print("Area after change radius circle: ");
        circle.resize(100);
        System.out.println(circle.getArea());

        System.out.println("-----------------");
        System.out.print("Area before change width: ");
        System.out.println(rectangle.getArea());
        System.out.print("Area after change width: ");
        rectangle.resize(100);
        System.out.println(rectangle.getArea());

        System.out.println("-----------------");
        System.out.print("Area before change edge: ");
        System.out.println(square.getArea());
        System.out.print("Area after change edge: ");
        square.resize(100);
        System.out.println(square.getArea());
    }
}
