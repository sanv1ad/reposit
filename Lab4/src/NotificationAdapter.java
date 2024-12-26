public class NotificationAdapter {
    private Notification notification;

    public NotificationAdapter(Notification notification) {
        this.notification = notification;
    }

    public void sendNotification(String title, String message) {
        notification.send(title, message);
    }
}