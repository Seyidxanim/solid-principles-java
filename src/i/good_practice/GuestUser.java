package i.good_practice;

public class GuestUser implements ViewPermission {
    @Override
    public void viewProfile() {
        System.out.println("Guest view profile");
    }
}