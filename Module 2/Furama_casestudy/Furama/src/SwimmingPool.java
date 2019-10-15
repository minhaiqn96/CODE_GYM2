import java.util.Date;

public class SwimmingPool {

    private int swimmingPool = 1;
    private int beginHour = 10;

    public int getSwimmingPool() {
        return swimmingPool;
    }

    public int getBeginHour() {
        return beginHour;
    }

    public void checkinCustomerHour(int hour) {
        if (hour < 8) {
            System.out.println("Swimming Pool isn't yet open, please waiting until to 9h Am");
        }
        else {
            System.out.println("You are allowed to checkin inside");
        }
    }

    public void checkDaysAccommodation(int money) {
        switch (money) {
            case 100:
                System.out.println("You can accomodate here 10 days");
                break;
            case 50:
                System.out.println("You can accomodate here 5 days");
                break;
            case 30:
                System.out.println("You can accomodate here 3 days");
            default:
                System.out.println("You have no choice");
        }
    }
}
