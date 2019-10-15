package payment;

import payment.inter.Payment;

public class MasterCard implements Payment {

    @Override
    public boolean payment(int money) {
        return true;
    }
}
