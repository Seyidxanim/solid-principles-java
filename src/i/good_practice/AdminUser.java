package i.good_practice;

public class AdminUser implements UserManagementPermission, ViewPermission {
    @Override
    public void createUser(String name) {
        System.out.println("Admin created user");
    }

    @Override
    public void deleteUser(int id) {
        System.out.println("Admin deleted user");
    }

    @Override
    public void viewProfile() {
        System.out.println("Admin view profile");
    }
}