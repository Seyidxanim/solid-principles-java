package o.good_practice;

public class PaypalPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Pay with paypal: " + amount);
    }
}
