//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Фабрика для Facebook
        SocialNetworkFactory facebookFactory = new FacebookFactory("user_facebook", "password123");
        facebookFactory.publishMessage("Hello, Facebook!");

        // Фабрика для LinkedIn
        SocialNetworkFactory linkedInFactory = new LinkedInFactory("user_linkedin@example.com", "password456");
        linkedInFactory.publishMessage("Hello, LinkedIn!");
    }
}