package accomodation;

public class Villa extends Accomodation {
    private int villa = 5;
    private int bed = 1;
    private int price = 10;
    private String[] villas;

    public Villa() {
    }

    public Villa(String name, int size, int price) {
        super(name, size, price);
    }

    public int getVilla() {
        return villa;
    }

    public int getBed() {
        return bed;
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public long payMent(int days) {
        return days * this.price;
    }

    public String[] getVillas() {
        return villas;
    }

    public void setVillas(String[] villas) {
        this.villas = villas;
    }

    public String[] villas() {
        String[] villas = new String[5];
        villas[0] = "Crow";
        villas[1] = "InterContinental";
        villas[2] = "villa3";
        villas[3] = "villa4";
        villas[4] = "villa5";
        return villas;
    }
}