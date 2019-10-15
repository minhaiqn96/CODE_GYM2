package lap1;

import lap1.inter.Resizeable;

public class Square extends Rectangle implements Resizeable {
    public double side = 1.0;

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public String toString() {
        return "A Square with size= "
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(4);
        System.out.println(square);

        square = new Square(6, "cyan", false);
        System.out.println(square);
    }

    @Override
    public void resize(double percent) {
        this.side = this.side * Math.sqrt(1 + (percent / 100));
    }
}
