package d.bad_practice;

public class NotificationManager {
    private EmailNotification notification = new EmailNotification();

    private void notifyUser(String message) {
        notification.send(message);
    }
}
