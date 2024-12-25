public class LinkedIn implements SocialNetwork {
    private String email;
    private String password;

    public LinkedIn(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void authenticate() {
        System.out.println("Authenticating to LinkedIn with email: " + email + " and password: " + password);
    }

    @Override
    public void postMessage(String message) {
        System.out.println("Posting message to LinkedIn: " + message);
    }
}
