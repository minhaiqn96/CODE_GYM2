package model;

public interface AccommodationIml {

    public static int PRICE_ONEDATE_VILLA = 500;
    public static int PRICE_ONEDATE_HOUSE = 300;
    public static int PRICE_ONEDATE_ROOM= 100;

    public float getCostFinal();
    public int getNumberDateStayInResort(int money);
    public void paymentMoneyByVisaCard();
    public void paymentMoneyByMasterCard();
}
