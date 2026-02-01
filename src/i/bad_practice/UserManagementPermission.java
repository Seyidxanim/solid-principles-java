package i.bad_practice;

public interface UserManagementPermission {

    void createUser(String name);

    void deleteUser(int id);

    void viewProfile();
}
