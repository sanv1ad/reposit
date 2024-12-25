// Інтерфейс для сховища
public interface Storage {
    void connect();
    //Завантажує файл у сховище.
    //Приймає ім'я файлу і вміст файлу у вигляді байтового масиву
    void uploadFile(String fileName, byte[] data);
    //Завантажує файл із сховища.
    //Приймає ім'я файлу (fileName) і повертає вміст файлу у вигляді байтового масиву.
    byte[] downloadFile(String fileName);
}
