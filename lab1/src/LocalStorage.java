//Локальне сховище
//Реалізація інтерфейсу
public class LocalStorage implements Storage {
    @Override
    public void connect() {
        System.out.println("Connected to Local Storage");
    }

    @Override
    public void uploadFile(String fileName, byte[] data) {
        System.out.println("File " + fileName + " uploaded to Local Storage");
    }

    @Override
    public byte[] downloadFile(String fileName) {
        System.out.println("File " + fileName + " downloaded from Local Storage");
        return new byte[0];
    }
}
