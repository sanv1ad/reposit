public abstract class SocialNetworkFactory {
    public abstract SocialNetwork createSocialNetwork();

    public void publishMessage(String message) {
        SocialNetwork socialNetwork = createSocialNetwork();
        socialNetwork.authenticate();
        socialNetwork.postMessage(message);
    }
}
