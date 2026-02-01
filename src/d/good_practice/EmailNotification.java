package d.good_practice;

public class EmailNotification implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Send email notification");
    }
}