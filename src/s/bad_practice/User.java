package s.bad_practice;

public class User {
    String name;
    String surname;
    int age;

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void sendEmail(String email) {
        System.out.println("Email send to: " + email);
    }

    public void createUser() {
        System.out.println("User created");
    }
}
