public class FacebookFactory extends SocialNetworkFactory {
    private String login;
    private String password;

    public FacebookFactory(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public SocialNetwork createSocialNetwork() {
        return new Facebook(login, password);
    }
}
