public class SlackNotification implements Notification {
    private String login;
    private String apiKey;
    private String chatId;

    public SlackNotification(String login, String apiKey, String chatId) {
        this.login = login;
        this.apiKey = apiKey;
        this.chatId = chatId;
    }

    @Override
    public void send(String title, String message) {
        System.out.println("Sent Slack message with title '" + title + "' to chat ID '" + chatId + "' that says '" + message + "'.");
    }
}