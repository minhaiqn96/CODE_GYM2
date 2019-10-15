package accomodation;

public class Tent extends Accomodation {

    private int price = 5;

    public Tent() {
    }

    public Tent(String name, int size, int price) {
        super(name, size, price);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public long payMent(int days) {
        return days * this.price;
    }
}
