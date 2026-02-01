package o.good_practice;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Pay with credit cart: " + amount);
    }
}
