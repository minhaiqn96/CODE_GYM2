package accomodation;

public abstract class Accomodation {

    private String name;
    private int size;
    private int price;

    public Accomodation() {
    }

    public Accomodation(String name, int size, int price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    public abstract long payMent(int days);
}
