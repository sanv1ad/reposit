import java.util.HashMap;
import java.util.Map;

//Одинак для управління доступом до сховищ
public class StorageManager {
    private static StorageManager instance;
    private Map<String, Storage> availableStorages = new HashMap<>();

    private StorageManager() {
        availableStorages.put("local", new LocalStorage());
        availableStorages.put("amazonS3", new AmazonS3Storage());
    }

//    Метод яки повертає єдиний екземпляр StorageManager
    public static synchronized StorageManager getInstance() {
        if (instance == null) {
            instance = new StorageManager();
        }
        return instance;
    }
//  Повертає сховище за його типом
    public Storage getStorage(String type) {
        return availableStorages.get(type);
    }
//  Додає новий тип сховища
    public void registerStorage(String type, Storage storage) {
        availableStorages.put(type, storage);
    }
}
