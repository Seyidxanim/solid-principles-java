package l.good_practice;

public class LocalStorage implements FileStorage {
    @Override
    public void save(String fileName) {
        System.out.println("Local storage file: " + fileName);
    }
}
