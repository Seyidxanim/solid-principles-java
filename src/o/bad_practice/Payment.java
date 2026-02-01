package o.bad_practice;

public class Payment {

    public void creditCardPayment(double amount) {
        System.out.println("Pay with card: " + amount);
    }

    public void payPal(double amount) {
        System.out.println("Pay with paypal: " + amount);
    }

    public void applePay(double amount) {
        System.out.println("Pay with apple pay: " + amount);
    }
}
