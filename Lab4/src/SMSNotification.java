public class SMSNotification implements Notification {
    private String phone;
    private String sender;

    public SMSNotification(String phone, String sender) {
        this.phone = phone;
        this.sender = sender;
    }

    @Override
    public void send(String title, String message) {
        System.out.println("Sent SMS with title '" + title + "' from '" + sender + "' to phone '" + phone + "' that says '" + message + "'.");
    }
}