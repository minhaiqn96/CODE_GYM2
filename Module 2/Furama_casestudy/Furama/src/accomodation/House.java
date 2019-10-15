package accomodation;

public class House extends Accomodation {

    private final int HOUR = 2;
    private int bed = 4;
    private int price = 5;
    private String[] houses;

    public House() {
    }

    public House(String name, int size, int price) {
        super(name, size, price);
    }

    public int getHouse() {
        return HOUR;
    }


    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
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
        return price;
    }

    @Override
    public long payMent(int days) {
        return days * this.price;
    }

    public String[] getHouses() {
        return houses;
    }

    public void setHouses(String[] houses) {
        this.houses = houses;
    }

    public String[] houses() {
        String[] houses = new String[5];
        houses[0] = "house1";
        houses[1] = "house2";
        houses[2] = "house3";
        houses[3] = "house4";
        houses[4] = "house5";
        return houses;
    }
}
