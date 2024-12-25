//Клас користувача
public class User {
    private String name;
    private Storage storage;

    public User(String name, Storage storage) {
        this.name = name;
        this.storage = storage;
    }

    public String getName() {
        return name;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public void uploadFile(String fileName, byte[] data) {
        storage.uploadFile(fileName, data);
    }

    public void downloadFile(String fileName) {
        storage.downloadFile(fileName);
    }
}
