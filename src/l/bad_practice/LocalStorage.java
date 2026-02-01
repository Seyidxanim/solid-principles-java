package l.bad_practice;

public class LocalStorage implements FileStorage {
    @Override
    public void save(String fileName) {
        throw new UnsupportedOperationException("Local storage is read-only");
    }
}
