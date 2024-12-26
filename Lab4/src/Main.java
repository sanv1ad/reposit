public class Main {
    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification("admin@example.com");
        Notification slackNotification = new SlackNotification("login", "apiKey", "chatId");
        Notification smsNotification = new SMSNotification("1234567890", "Sender");

        NotificationAdapter emailAdapter = new NotificationAdapter(emailNotification);
        NotificationAdapter slackAdapter = new NotificationAdapter(slackNotification);
        NotificationAdapter smsAdapter = new NotificationAdapter(smsNotification);

        emailAdapter.sendNotification("Email Title", "Email Message");
        slackAdapter.sendNotification("Slack Title", "Slack Message");
        smsAdapter.sendNotification("SMS Title", "SMS Message");
    }
}