

// Головний клас для тестування
public class Main {
    public static void main(String[] args) {
        StorageManager storageManager = StorageManager.getInstance();

        // Створення користувачів
        User user1 = new User("Alice", storageManager.getStorage("local"));
        User user2 = new User("Bob", storageManager.getStorage("amazonS3"));

        // Використання сховищ
        user1.uploadFile("file1.txt", new byte[]{});
        user2.uploadFile("file2.txt", new byte[]{});

        // Зміна сховища для користувача
        user1.setStorage(storageManager.getStorage("amazonS3"));
        user1.uploadFile("file3.txt", new byte[]{});
    }
}