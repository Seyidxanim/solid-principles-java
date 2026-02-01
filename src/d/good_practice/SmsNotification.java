package d.good_practice;

public class SmsNotification implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Send sms notification");
    }
}