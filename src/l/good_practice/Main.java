package l.good_practice;


public class Main {
    public static void main(String[] args) {
        FileStorage storage1 = new LocalStorage();
        storage1.save("document");
        FileStorage storage2 = new CloudStorage();
        storage2.save("pdf");
    }
}
