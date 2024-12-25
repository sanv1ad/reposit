public class LinkedInFactory extends SocialNetworkFactory {
    private String email;
    private String password;

    public LinkedInFactory(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public SocialNetwork createSocialNetwork() {
        return new LinkedIn(email, password);
    }
}
