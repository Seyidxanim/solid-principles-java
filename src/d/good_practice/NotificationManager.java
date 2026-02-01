package d.good_practice;

public class NotificationManager {
    private NotificationSender notification;

    public NotificationManager(NotificationSender notification) {
        this.notification = notification;
    }

    public void notify(String message) {
        notification.send(message);
    }
}
