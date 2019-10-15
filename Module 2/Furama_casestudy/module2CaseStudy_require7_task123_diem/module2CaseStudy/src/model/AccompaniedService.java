package model;

public class AccompaniedService {

    private String   nameService ;
    private int unit ;
    private double PRICE_MASSAGE = 2;
    private double PRICE_KARA0KE = 10;
    private double PRICE_FOOD = 5;
    private double PRICE_WATER = 2;


    public AccompaniedService() {
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public double getPRICE_MASSAGE() {
        return PRICE_MASSAGE;
    }



    public double getPRICE_KARA0KE() {
        return PRICE_KARA0KE;
    }


    public double getPRICE_FOOD() {
        return PRICE_FOOD;
    }


    public double getPRICE_WATER() {
        return PRICE_WATER;
    }


}
