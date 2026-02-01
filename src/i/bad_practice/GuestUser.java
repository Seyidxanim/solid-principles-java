package i.bad_practice;

public class GuestUser implements UserManagementPermission {
    @Override
    public void createUser(String name) {
        throw new RuntimeException();
    }

    @Override
    public void deleteUser(int id) {
        throw new RuntimeException();
    }

    @Override
    public void viewProfile() {
        System.out.println("Guest view profile");
    }
}