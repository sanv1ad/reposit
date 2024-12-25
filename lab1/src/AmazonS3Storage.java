//Сховище Amazon S3
//Реалізація інтерфейсу
public class AmazonS3Storage implements Storage {
    @Override
    public void connect() {
        System.out.println("Connected to Amazon S3 Storage");
    }

    @Override
    public void uploadFile(String fileName, byte[] data) {
        System.out.println("File " + fileName + " uploaded to Amazon S3 Storage");
    }

    @Override
    public byte[] downloadFile(String fileName) {
        System.out.println("File " + fileName + " downloaded from Amazon S3 Storage");
        return new byte[0];
    }
}
