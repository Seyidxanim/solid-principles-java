package o.good_practice;

public class ApplePayPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Pay with apple pay: " + amount);
    }
}
