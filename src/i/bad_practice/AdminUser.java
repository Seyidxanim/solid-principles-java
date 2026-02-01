package i.bad_practice;

public class AdminUser implements UserManagementPermission {
    @Override
    public void createUser(String name) {
        System.out.println("User created");
    }

    @Override
    public void deleteUser(int id) {
        System.out.println("User deleted");
    }

    @Override
    public void viewProfile() {
        System.out.println("Admin view profile");
    }
}