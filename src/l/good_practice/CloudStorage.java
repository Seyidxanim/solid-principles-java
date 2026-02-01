package l.good_practice;

public class CloudStorage implements FileStorage {
    @Override
    public void save(String fileName) {
        System.out.println("Cloud storage file name: " + fileName);
    }
}
