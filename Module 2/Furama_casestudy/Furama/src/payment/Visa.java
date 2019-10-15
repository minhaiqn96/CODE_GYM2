package payment;

import payment.inter.Payment;

public class Visa implements Payment {

    @Override
    public boolean payment(int money) {
        return true;
    }
}
