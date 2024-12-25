public class Facebook implements SocialNetwork {
    private String login;
    private String password;

    public Facebook(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public void authenticate() {
        System.out.println("Authenticating to Facebook with login: " + login + " and password: " + password);
    }

    @Override
    public void postMessage(String message) {
        System.out.println("Posting message to Facebook: " + message);
    }
}
